<template>
  <div>
    <el-card class="searchbox">
      <el-row>
        <el-col :span="22">
          <el-input v-model="input" placeholder="Search out courses"></el-input>
        </el-col>
        <el-col :span="0.5" :offset="1">
          <el-button icon="el-icon-search" circle></el-button>
        </el-col>
      </el-row>
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
  </div>
</template>

<style scoped>
.searchbox {
  width: 90%;
  margin-left: 5%;
  margin-top: 5%;
}
</style>
