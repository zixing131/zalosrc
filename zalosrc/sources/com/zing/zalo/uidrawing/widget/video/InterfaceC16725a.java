package com.zing.zalo.uidrawing.widget.video;

import android.view.Surface;
import android.view.View;

/* renamed from: com.zing.zalo.uidrawing.widget.video.a */
/* loaded from: classes4.dex */
public interface InterfaceC16725a {

    /* renamed from: com.zing.zalo.uidrawing.widget.video.a$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo89176a(b bVar);

        /* renamed from: b */
        void mo89177b(b bVar, int i11, int i12);

        /* renamed from: c */
        void mo89178c(b bVar, int i11, int i12, int i13);
    }

    /* renamed from: com.zing.zalo.uidrawing.widget.video.a$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo89169a();

        /* renamed from: b */
        Surface mo89170b();

        /* renamed from: c */
        InterfaceC16725a mo89171c();
    }

    /* renamed from: a */
    void mo89164a(int i11, int i12);

    /* renamed from: b */
    void mo89165b(a aVar);

    /* renamed from: c */
    boolean mo89166c();

    /* renamed from: d */
    void mo89167d(a aVar);

    /* renamed from: e */
    void mo89168e(int i11, int i12, boolean z11, int i13, int i14);

    View getView();

    void setAspectRatio(int i11);

    void setVideoRotation(int i11);
}
