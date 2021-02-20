<template>
  <div class="background">
    <el-card class="box-card">
      MY COURSES
    </el-card>

    <div
      style="width: 90%; margin-left: 6.5%; margin-top: 3%; flex-wrap: wrap; display: flex"
    >
      <div
        v-for="course in courses"
        v-bind:key="course.id"
        style="width: 45%; margin-right: 3%; margin-bottom: 3%"
      >
        <el-card
          :body-style="{ padding: '20px' }"
          style="box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.2); border-radius: 10px; shadow: hover;"
        >
          <img src="../assets/img/courses.jpg" class="image" />
          <div class="courses_txt" style="padding: 10px">
            <span>{{ course.name }}</span>
          </div>
        </el-card>
      </div>
    </div>

    <el-card class="box-card">
      MY PROFILE
    </el-card>
    <el-card class="my-profile">
      <el-input
        class="myprofileinput"
        v-model="firstname"
        placeholder="firstname"
        clearable
      >
        <el-button slot="prepend" icon="el-icon-user"></el-button>
      </el-input>
      <el-input
        class="myprofileinput"
        v-model="lastname"
        placeholder="lastname"
        clearable
      >
        <el-button slot="prepend" icon="el-icon-user"></el-button>
      </el-input>
      <el-input
        class="myprofileinput"
        v-model="phone"
        placeholder="phone"
        clearable
      >
        <el-button slot="prepend" icon="el-icon-phone-outline"></el-button>
      </el-input>
      <el-input
        class="myprofileinput"
        v-model="email"
        placeholder="email"
        clearable
      >
        <el-button slot="prepend" icon="el-icon-message"></el-button>
      </el-input>
      <el-row>
        <el-button
          type="primary"
          plain
          style="float: right; margin-right: 10%; margin-top: 3%; "
          >submit</el-button
        >
      </el-row>
    </el-card>
  </div>
</template>

<script>
export default {
  data() {
    return {
      firstname: "",
      lastname: "",
      phone: "",
      email: "",
      courses: [
        { id: 1, name: "course" },
        { id: 1, name: "course" },
        { id: 1, name: "course" },
        { id: 1, name: "course" },
      ],
    };
  },
};
</script>

<style scoped>
.background {
}
.box-card {
  font-family: monaco;
  width: 30%;
  margin-left: 5%;
  margin-top: 5%;
}
.my-profile {
  width: 60%;
  margin-left: 7%;
  margin-top: 2%;
}
.myprofileinput {
  width: 90%;
  margin-top: 2%;
  margin-left: 3%;
}

.image {
  width: 100%;
}
.courses_txt {
  font-family: monaco;
}
</style>
