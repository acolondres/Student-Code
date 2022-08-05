<template>
 <div>
    <best-seller-list />
    <new-releases-list />

</template>

<script>

import BestsellerList from '@/components/BestsellerList.vue';
import NewReleasesList from '@/components/NewReleasesList.vue';

export default {

    components: {
        BestsellerList,
        NewReleasesList
    }

};
</script>

<style>

</style>