package com.example.myapplication.ui.chatting;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChattingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChattingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Chatting fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}