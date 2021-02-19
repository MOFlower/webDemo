a<template>
  <div class="header">
    <el-row>
      <el-menu
        class="el-menu"
        mode="horizontal"
        @select="handleSelect"
        router="true"
        text-color="aliceblue"
        active-text-color="#20a0ff"
      >
        <el-col :span="1.5" :offset="0.5">
          <el-menu-item index="userhome">
            HOME
          </el-menu-item>
        </el-col>
        <el-col :span="1.5">
          <el-menu-item index="courses">
            COURSES
          </el-menu-item>
        </el-col>
        <el-col :span="1.5" :offset="18">
          <el-menu-item index="introduction">
            LOG OUT
          </el-menu-item>
        </el-col>
      </el-menu>
    </el-row>
  </div>
</template>
<script>
export default {
  data() {
    return {};
  },
  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    },
  },
};
</script>

<style scoped>
.el-menu {
  height: 55px;
  background-color: #242f42;
  font-family: monaco;
}
</style>
