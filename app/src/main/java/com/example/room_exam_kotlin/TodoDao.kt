package com.example.room_exam_kotlin

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TodoDao {
    @Query("SELECT * FROM Todo")
    fun getAll(): LiveData<List<Todo>>

    @Insert
    fun insert(todo: Todo) //suspend 무조건 비동기(코루틴)로 실행 해야함.

    @Update
    fun update(todo: Todo)

    @Delete
    fun delete(todo: Todo)
}