<template>
  <div class="outPage">
    <div class="page">
      <div style="background-color: rgb(226, 233, 240); min-height: 800px">
        <vhead></vhead>
        <div style="position: fixed; top: 0%; width: 80%; z-index: 1;">
          <vhead></vhead>
        </div>
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
  min-width: 1024px;
  min-height: 768px;
}
.page {
  margin-left: 10%;
  width: 80%;
  height: auto;
}
</style>
