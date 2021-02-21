<template>
  <div>
    <el-card style="width: 90%; margin: 20px 5% 5% 5%;">
      <div style="display: flex;">
        <div style="width: 95%">
          <el-input
            v-model="CommunicationMsg.msg"
            placeholder="Give your message"
            clearable
            @clear="search"
            @keyup.enter.native="search"
          ></el-input>
        </div>
        <div style="margin-left: 2%">
          <el-button icon="el-icon-edit" circle @click="submitMsg"></el-button>
        </div>
      </div>
    </el-card>

    <div
      v-for="item in messages"
      v-bind:key="item.id"
      style="width: 70%; margin-left: 5%; margin-top: 1%; "
    >
      <el-card style="border-radius: 10px;">
        <el-input
          type="textarea"
          autosize
          v-model="item.msg"
          style="width: 85%;font-size: 18px;"
        >
        </el-input>
        <el-button style="border-radius: 50px; margin-left: 20px;">
          {{ item.id }}
        </el-button>
      </el-card>
    </div>
  </div>
</template>

<script>
export default {
  created() {
    this.getAllMsg();
  },
  data() {
    return {
      CommunicationMsg: {
        id: "",
        msg: "",
        usernmae: "",
      },
      messages: [],
    };
  },
  methods: {
    submitMsg() {
      if (this.CommunicationMsg.msg != "") {
        this.$axios({
          method: "post",
          url: "/api/submitMsg",
          data: this.CommunicationMsg,
        });
        setTimeout(() => {
          this.getAllMsg();
        }, 1000);
        // this.$message.success("submit success");
      } else {
        this.$message.error("please enter something");
      }
    },
    getAllMsg() {
      this.$axios({
        method: "post",
        url: "/api/getMsg",
      }).then((res) => {
        this.messages = res.data.list;
      });
    },
  },
};
</script>

<style scoped></style>
