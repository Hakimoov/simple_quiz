package com.example.mainactivity.models;

import java.util.ArrayList;
import java.util.List;

public class Question {
    String text;
    String answer1;
    String answer2;
    String answer3;
    int trueAnswer;

    public Question(String text, String answer1, String answer2, String answer3, int trueAnswer) {
        this.text = text;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.trueAnswer = trueAnswer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public int getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(int trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public static List<Question> initQuestions()
    {
        List question = new ArrayList<Question>();

        question.add(new Question("1.Kompyuterni o‘chirmasdan uning ishini vaqtincha to‘xtatib qo‘yish rejimi qanday ataladi?\n",
                "a)Kutish rejimi\n",
                "b)O‘chirish rejimi\n",
                "c)Qayta yuklash rejimi\n",
                2));


        question.add(new Question("2.Odatda Korzinadan ob’ektlarni tiklash jarayonida ob’ektlar qayerga tiklanadi?\n",
                "a)“Мой компьютер” papkasiga\n",
                "b)Foydalanuvchi tomonidan ko‘rsatilgan joyga\n",
                "c)O‘chirilgan vaqtdagi asl joyiga\n",
                1));

        question.add(new Question("2.Qaysi tugmalar birikmasi yordamida ob’ektlar almashish buferiga kesib olinadi?\n",
                "a)Ctrl+X\n",
                "c)Ctrl+V\n",
                "d)Alt+C",
                3 ));



        return question;
    }
}
