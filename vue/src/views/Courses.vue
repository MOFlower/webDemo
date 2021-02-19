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
  </div>
</template>

<style scoped>
.searchbox {
  width: 90%;
  margin-left: 5%;
  margin-top: 5%;
}
</style>
