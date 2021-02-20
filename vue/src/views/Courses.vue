<template>
  <div>
    <el-card class="searchbox">
      <el-row>
        <el-col :span="22">
          <el-input
            v-model="queryInfo.info"
            placeholder="Search our courses"
            clearable
            @clear="search"
            @keyup.enter.native="search"
          ></el-input>
        </el-col>
        <el-col :span="0.5" :offset="1">
          <el-button icon="el-icon-search" circle @click="search" ></el-button>
        </el-col>
      </el-row>
    </el-card>

    <div
      style="width: 90%; margin-left: 6.5%; margin-top: 3%; flex-wrap: wrap; display: flex"
    >
      <div
        v-for="course in courses"
        v-bind:key="course.id"
        style="width: 30%; margin-right: 3%; margin-bottom: 3%"
      >
        <el-card
          :body-style="{ padding: '20px' }"
          style="box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.2); border-radius: 10px; shadow: hover;"
        >
          <img src="../assets/img/courses.jpg" class="image" />
          <div class="courses_txt" style="padding: 10px">
            <span>{{ course.courseName }}</span>
          </div>
        </el-card>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  created() {
    this.search();
  },
  data() {
    return {
      queryInfo: {
        info: "",
        pageNum: 1,
        pageSize: 10,
      },
      courses: [],
    };
  },
  methods: {
    load() {
      if (this.count < 3) {
        this.count += 1;
      }
    },
    search() {
      this.$axios({
        method: "post",
        url: "/api/course/search",
        data: this.queryInfo,
      }).then((res) => {
        console.log(res);
        console.log(this.courses);
        this.courses = res.data.courseList;
        console.log(this.courses);
      });
    },
  },
};
</script>

<style scoped>
.searchbox {
  width: 90%;
  margin-left: 5%;
  margin-top: 5%;
}
.image {
  width: 100%;
}
.courses_txt {
  font-family: monaco;
}
</style>
