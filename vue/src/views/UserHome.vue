<template>
  <div class="background">
    <el-card class="box-card">
      MY COURSES
    </el-card>

    <div style="width: 80%; margin-left: 10%; margin-top: 2%">
      <el-row :gutter="30">
        <el-col :span="12">
          <el-card :body-style="{ padding: '20px' }">
            <img src="../assets/img/courses.jpg" class="image" />
            <div class="courses_txt" style="padding: 10px">
              <span>courses</span>
            </div>
          </el-card>
        </el-col>

        <el-col :span="12">
          <el-card :body-style="{ padding: '20px' }">
            <img src="../assets/img/courses.jpg" class="image" />
            <div class="courses_txt" style="padding: 10px">
              <span>courses</span>
            </div>
          </el-card>
        </el-col>
      </el-row>
      <el-row :gutter="30" style="margin-top: 3%">
        <el-col :span="12">
          <el-card :body-style="{ padding: '20px' }">
            <img src="../assets/img/courses.jpg" class="image" />
            <div class="courses_txt" style="padding: 10px">
              <span>courses</span>
            </div>
          </el-card>
        </el-col>
        <el-col :span="12">
          <el-card :body-style="{ padding: '20px' }">
            <img src="../assets/img/courses.jpg" class="image" />
            <div class="courses_txt" style="padding: 10px">
              <span>courses</span>
            </div>
          </el-card>
        </el-col>
      </el-row>
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
