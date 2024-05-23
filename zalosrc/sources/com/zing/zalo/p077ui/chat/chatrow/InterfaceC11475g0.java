package com.zing.zalo.p077ui.chat.chatrow;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.androidquery.util.C3979l;
import com.zing.zalo.zview.animation.AnimationTarget;
import dj.C17945a0;
import lb0.C22405g;

/* renamed from: com.zing.zalo.ui.chat.chatrow.g0 */
/* loaded from: classes5.dex */
public interface InterfaceC11475g0 extends AnimationTarget {
    Rect getBubbleRect();

    View getChatRowView();

    int getJumpTargetY();

    C17945a0 getMessage();

    C17945a0 getMessageForReply();

    int getMyReactionCount();

    Rect getPhotoCoords();

    int getPosition();

    C22405g getReactionBar();

    Rect getReactionRect();

    Rect getReferenceThumbPosition();

    C3979l getThumbImageInfo();

    int getTopAbs();

    int getTotalReaction();

    float getTranslationXAbs();

    /* renamed from: h */
    void mo61065h(MotionEvent motionEvent);

    void setTranslationXAbs(float f11);
}
