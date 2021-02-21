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
        <el-menu-item index="userhome">
          HOME
        </el-menu-item>
        <el-menu-item index="courses">
          COURSES
        </el-menu-item>
        <el-menu-item index="communication">
          COMMUNICATION
        </el-menu-item>
        <div style="position: absolute; right: 0%">
          <el-menu-item index="introduction">
            LOG OUT
          </el-menu-item>
        </div>
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
  height: 60px;
  background-color: #242f42;
  font-family: monaco;
}
</style>
