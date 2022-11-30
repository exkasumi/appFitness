package com.example.applicationfitness.models

import com.example.applicationfitness.R

data class ExcerModel(
    val title : String,
    val descr : String,
    val image : Int,
    val itemid : Int,
)

val excerList = listOf<ExcerModel>(

    ExcerModel("Жим штанги лежа",  "Жим лежа – это многосуставное базовое физическое упражнение с использованием свободных весов (к свободным весам относятся незакрепленные снаряды, такие как штанги, гири, гантели).", R.drawable.bench, 1001),
    ExcerModel("Присед со штангой",  "Приседания со штангой - базовое упражнение в бодибилдинге и пауэрлифтинге, для развития мышц бедра и ягодиц. Атлет, выполняющий упражнение, приседает и затем встаёт со штангой на плечах, возвращаясь в исходное положение стоя. Приседания считаются одним из важнейших упражнений не только в силовом спорте, но и в общефизической подготовке, а также используются в качестве вспомогательного упражнения в процессе подготовки атлетов практически всех видов спорта.", R.drawable.squat, 1002),
    ExcerModel("Армейский жим",  "Армейский жим, или жим штанги стоя – базовая нагрузка, которая развивает мышцы дельт, а так же подключает в работу верхнее отделение спины. При классическом варианте упражнение выполняется из положения стоя.", R.drawable.ohp, 1003),
    ExcerModel("Подъем на бицепс",  "Подъем штанги на бицепс - основное упражнение для увеличения массы бицепса, которые также задействует мышцы предплечья (плечелучевую) и лучезапястные суставы.", R.drawable.biceps, 1004),
    ExcerModel("Становая тяга",  "Становая тяга — базовое (многосуставное) упражнение, выполняемое обычно со штангой, а также с гантелью или гирей, удерживаемыми обеими руками и поднимаемая на уровень опущенных вытянутых рук. Используется как общий элемент физической подготовки и является одной из соревновательных дисциплин в таких видах спорта как пауэрлифтинг и силовой экстрим, применяется также и бодибилдерами для укрепления мышц поясницы, что позволяет в приседаниях лучше развивать ноги.", R.drawable.deadlift, 1005),
    ExcerModel("Отжимания брусья",  "Отжимания на брусьях – широко известное и достаточно доступное упражнение. Брусья стоят практически в каждом дворе, никаких вложений такие занятия не требуют."
           , R.drawable.triceps, 1006),
    ExcerModel("Подтягивания",  "Подтя́гивания — базовое физическое упражнение, развивающее группы мышц верхней части тела: широчайшие, бицепсы, брахиалис, предплечья. Выполняется в висе и представляет собой поднятие и опускание тела с помощью рук.", R.drawable.pull, 1007),
    ExcerModel("Плечи разводка",  " ", R.drawable.shoulders, 1008),
)