<script setup>
</script>

<template>
  <div>
    <h1 class="text-2xl mb-5">문의게시판</h1>

    <!--    인풋 섹션-->
    <div class="mb-20 border-y">

      <!--      카테고리-->
      <div class="flex border-b">
        <div class="w-3/12 pl-5 bg-gray-100 py-1">분류*</div>
        <div class="w-9/12 pl-3 py-1">
          <select class="border w-4/12">
            <option disabled selected>분류 선택</option>
          </select>
        </div>
      </div>

      <!--      제목-->
      <div class="flex border-b">
        <div class="w-3/12 pl-5 bg-gray-100 py-1">제목*</div>
        <div class="py-1 pl-3 w-9/12">
          <input type="text" placeholder="제목을 입력해 주세요." class="border w-10/12 pl-2">
        </div>
      </div>

      <!--      내용-->
      <div class="flex border-b">
        <div class="w-3/12 pl-5 bg-gray-100 py-28">내용*</div>
        <div class="py-1 pl-3 w-9/12">
          <textarea class="resize-none border w-10/12 py-24"></textarea>
        </div>
      </div>
<!--      비밀글-->
      <div class="flex border-b">
        <div class="w-3/12 pl-5 bg-gray-100 py-1">비밀글</div>
        <div class="py-1 pl-3 w-9/12">
          <input type="checkbox" class="mr-2">
          <input type="password" placeholder="비밀번호 입력" class="pl-2 border">
        </div>
      </div>
    </div>

    <!--    버튼 섹션-->
    <div class="flex justify-center">
      <button class="px-4 border mr-5 duration-300 hover:duration-300 hover:bg-gray-100">등록</button>
      <button class="px-4 border bg-gray-50 duration-300 hover:duration-300 hover:bg-gray-200">취소</button>
    </div>
  </div>
</template>