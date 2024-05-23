package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* renamed from: com.google.android.flexbox.a */
/* loaded from: classes2.dex */
interface InterfaceC4003a {
    /* renamed from: a */
    void mo18938a(View view, int i11, int i12, C4004b c4004b);

    /* renamed from: b */
    int mo18939b(int i11, int i12, int i13);

    /* renamed from: c */
    View mo18940c(int i11);

    /* renamed from: d */
    int mo18941d(int i11, int i12, int i13);

    /* renamed from: e */
    int mo18942e(View view);

    /* renamed from: f */
    void mo18943f(C4004b c4004b);

    /* renamed from: g */
    View mo18944g(int i11);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    /* renamed from: h */
    void mo18945h(int i11, View view);

    /* renamed from: i */
    int mo18946i(View view, int i11, int i12);

    /* renamed from: j */
    boolean mo18947j();

    void setFlexLines(List list);
}
