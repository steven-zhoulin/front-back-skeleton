<template>
    <table>
        <tr>
            <th>编号</th>
            <th>内容</th>
        </tr>
        <tr v-for="(item, index) in notifies" :key="index">
            <td>{{item.id}}</td>
            <td>{{item.content}}</td>
        </tr>
    </table>
</template>

<script>
    export default {
        name: "Notify",
        data() {
            return {
                notifies: [
                    {id: 1, content: '123'},
                    {id: 2, content: '123123'},
                ],
            }
        },
        created() {
            const _this = this;
            axios.get('http://127.0.0.1:8181/api/demo/notify/list').then(function (res) {
                console.log(res.data);
                _this.notifies = res.data;
            })
        }
    }
</script>

<style scoped>

</style>