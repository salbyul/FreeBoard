<script setup>
import SearchConditionLayout from '../../components/SearchConditionLayout.vue'
import Pagination from "../../components/Pagination.vue";
</script>

<template>
  <div>
    <h1 class="text-2xl mb-5">갤러리</h1>
    <SearchConditionLayout/>
    <div class="text-center mb-20">
      <div class="text-end">
        <button class="border px-4 py-1 bg-gray-50 mb-2 rounded-sm">글 등록</button>
      </div>
      <!--      게시글 목록-->
      <div>
        <router-link :to="'/gallery/' + 10">
          <div class="border p-2 flex hover:cursor-pointer hover:bg-gray-50">
            <div class="w-3/12 border">사진!!!</div>
            <div class="w-8/12 text-start pl-2">
              <strong>이브레인 2023년도 워크샵 기념 갤러리</strong>
              <div class="text-sm">
                오픈 기념으로 어쩌구저쩌구 모십니다. 많은 응모 어쩌구 저쩌구... 오픈 기념으로 어쩌구저쩌구 모십니다. 많은 응모 어쩌구 저쩌구...asdfasdfasdf
              </div>
            </div>
          </div>
        </router-link>
      </div>
    </div>
    <Pagination/>
  </div>
</template>