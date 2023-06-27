<script setup>
import SmallListDisplay from "../components/SmallListDisplay.vue";
</script>

<template>
  <div>
    <div class="flex justify-evenly py-3">
      <SmallListDisplay kind="notice"/>
      <SmallListDisplay kind="free"/>
    </div>
    <div class="flex justify-evenly py-3">
      <SmallListDisplay kind="gallery"/>
      <SmallListDisplay kind="inquiry"/>
    </div>
  </div>
</template>