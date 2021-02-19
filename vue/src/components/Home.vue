<template>
  <div class="outPage">
    <div class="page">
    <vhead></vhead>

    <router-view> </router-view>
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
}
.page{
  margin-left: 10%;
  width: 80%;
  height: 1000px;
}
</style>