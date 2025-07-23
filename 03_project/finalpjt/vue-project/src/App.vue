<script setup>
// App.vue: 전체 앱의 레이아웃(헤더, 사이드바, 라우터 뷰)
import AppHeader from "./layout/AppHeader.vue";
import AppSidebar from "./layout/AppSidebar.vue";
</script>

<template>
  <div class="app-layout">
    <!-- 상단 헤더 -->
    <AppHeader />
    <div class="main-area">
      <!-- 좌측 사이드바 -->
      <AppSidebar />
      <!-- 라우터 뷰: 각 페이지가 이 영역에 표시됨 -->
      <main class="content-area">
        <router-view />
      </main>
    </div>
  </div>
</template>

<style scoped>
.app-layout {
  display: flex;
  flex-direction: column;
  min-height: 100vh;
}
.main-area {
  display: flex;
  flex: 1;
}
.content-area {
  flex: 1;
  padding: 2rem;
  background: #f8f9fa;
}
</style>
