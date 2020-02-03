<template>
    <el-card class="box-card">
        <el-table :data="tableData" border style="width: 100%">
            <el-table-column prop="id" label="ID" width="100px" align="center"></el-table-column>
            <el-table-column prop="name" label="城市名称" align="center"></el-table-column>
            <el-table-column prop="cityId" label="城市编号" align="center"></el-table-column>
            <el-table-column prop="provinceId" label="归属省ID" align="center"></el-table-column>
            <el-table-column label="操作" align="center">
                <template slot-scope="scope">
                    <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
                    <el-button type="text" size="small">编辑</el-button>
                </template>
            </el-table-column>
        </el-table>
        <el-pagination align="left" background layout="prev, pager, next" :page-size="pageSize" :total="total" @current-change="page"></el-pagination>
    </el-card>
</template>

<script>
    export default {
        methods: {
            handleClick(row) {
                console.log(row);
            },
            page(current) {
                this.loadCity(current, 5)
            },
            loadCity(current, size) {
                const _this = this;
                axios.get('http://127.0.0.1:8181/api/demo/city/list/' + current + '/' + size).then(function (res) {
                    _this.total = res.data.total;
                    _this.tableData = res.data.records;
                })
            }
        },

        data() {
            return {
                total: -1,
                pageSize: 5,
                tableData: []
            }
        },

        created() {
            this.loadCity(1, 5);
        }
    }
</script>

<style>

</style>