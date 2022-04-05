package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation


class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.string.gaji1,R.drawable.job1),
            Affirmation(R.string.affirmation2, R.string.gaji2,R.drawable.job2),
            Affirmation(R.string.affirmation3, R.string.gaji3,R.drawable.job3),
            Affirmation(R.string.affirmation4, R.string.gaji4,R.drawable.job4),
            Affirmation(R.string.affirmation5, R.string.gaji5,R.drawable.job5),
            Affirmation(R.string.affirmation6, R.string.gaji6,R.drawable.job6),
            Affirmation(R.string.affirmation7, R.string.gaji7,R.drawable.job7),
            Affirmation(R.string.affirmation8, R.string.gaji8,R.drawable.job8),
            Affirmation(R.string.affirmation9, R.string.gaji9,R.drawable.job9),
            Affirmation(R.string.affirmation10, R.string.gaji10,R.drawable.job10)
        )
    }
}