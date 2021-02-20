<template>
  <div class="outPage">
    <div class="page">
      <div style="background-color: rgb(226, 233, 240)">
      <vhead></vhead>
        <router-view> </router-view>
        <div style="height: 100px"></div>
      </div>
    </div>
  </div>
</template>

<script>
import vhead from "./Header.vue";
export default {
  components: {
    vhead,
  },
};
</script>

<style scoped>
.outPage {
  background-color: whitesmoke;
  color:rgb(226, 233, 240);
}
.page {
  margin-left: 10%;
  width: 80%;
  height: auto;
}
</style>
