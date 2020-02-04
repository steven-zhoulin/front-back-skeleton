<template>
    <el-card class="box-card">
        <div slot="header" class="clearfix">
            <span>清单</span>
        </div>
        <el-table :data="tableData" border style="width: 100%">
            <el-table-column prop="id" label="ID" width="100px" align="center"></el-table-column>
            <el-table-column prop="name" label="城市名称" align="center"></el-table-column>
            <el-table-column prop="cityId" label="城市编号" align="center"></el-table-column>
            <el-table-column prop="provinceId" label="省编号" align="center"></el-table-column>
            <el-table-column prop="provinceName" label="省份" align="center"></el-table-column>
            <el-table-column label="操作" align="center">
                <template slot-scope="scope">
                    <el-button @click="handleDelete(scope.row)" type="text" size="small">删除</el-button>
                    <el-button @click="handleEdit(scope.row)" type="text" size="small">编辑</el-button>
                </template>
            </el-table-column>
        </el-table>
        <el-pagination align="left" background layout="prev, pager, next" :page-size="pageSize" :total="total" @current-change="page"></el-pagination>
    </el-card>
</template>

<script>
    export default {
        methods: {
            handleEdit(row) {
                this.$router.push({
                    path: '/CityEdit',
                    query: {
                        id: row.id,
                        name: row.name,
                        cityId: row.cityId,
                        provinceId: row.provinceId
                    }
                });
            },
            handleDelete(row) {
                if (row.id) {
                    const _this = this;
                    axios.get('/api/demo/city/delete/' + row.id).then(function (res) {
                        _this.$message({
                            message: '删除成功！',
                            type: 'success'
                        });
                        _this.loadCity(1, 5);
                    })
                }

            },
            page(current) {
                this.loadCity(current, 5)
            },
            loadCity(current, size) {
                const _this = this;
                axios.get('/api/demo/city/list/' + current + '/' + size).then(function (res) {
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