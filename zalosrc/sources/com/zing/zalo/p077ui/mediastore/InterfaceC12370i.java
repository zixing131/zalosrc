package com.zing.zalo.p077ui.mediastore;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1767f;
import com.zing.zalo.adapters.C7226u3;
import com.zing.zalo.control.C7905c;
import com.zing.zalo.p077ui.mediastore.MediaStoreBasePage;
import com.zing.zalo.p077ui.mediastore.MediaStoreView;
import java.util.List;

/* renamed from: com.zing.zalo.ui.mediastore.i */
/* loaded from: classes6.dex */
public interface InterfaceC12370i extends InterfaceC1767f {
    /* renamed from: A */
    void mo69035A();

    /* renamed from: Aj */
    void mo69036Aj();

    /* renamed from: BH */
    boolean mo69037BH();

    /* renamed from: CA */
    void mo69039CA(MediaStoreBasePage.InterfaceC12276c interfaceC12276c);

    /* renamed from: DG */
    void mo69041DG(Object obj);

    /* renamed from: H0 */
    void mo69043H0();

    /* renamed from: Hi */
    C7226u3.c mo69044Hi();

    /* renamed from: Jy */
    boolean mo69047Jy(int i11);

    /* renamed from: Kr */
    void mo69049Kr(boolean z11);

    /* renamed from: L */
    void mo69050L();

    /* renamed from: Lk */
    void mo69051Lk(C12369h c12369h, Bundle bundle);

    /* renamed from: Lo */
    void mo69052Lo(boolean z11);

    /* renamed from: RE */
    void mo69056RE();

    /* renamed from: Vh */
    void mo69060Vh(MediaStoreBasePage.InterfaceC12275b interfaceC12275b);

    /* renamed from: b3 */
    void mo69063b3();

    /* renamed from: bx */
    void mo69065bx();

    /* renamed from: dg */
    void mo69066dg();

    /* renamed from: fj */
    boolean mo69068fj();

    String getTrackingKey();

    /* renamed from: gv */
    void mo69070gv();

    /* renamed from: iB */
    MediaStoreView.MediaStoreMultiSelectionBottomView.InterfaceC12317a mo69071iB();

    void onActivityResult(int i11, int i12, Intent intent);

    void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr);

    /* renamed from: uD */
    void mo69079uD(boolean z11, C7905c c7905c, int i11);

    /* renamed from: v */
    List mo69082v();

    /* renamed from: xh */
    boolean mo69084xh();
}
