package com.zing.zalo.p077ui.mycloud;

import android.os.Bundle;
import android.view.View;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.p077ui.chat.transfer.ChatOpenParam;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zview.animation.AnimationTarget;
import dj.C17945a0;
import java.util.ArrayList;
import java.util.List;
import p239ih.C20556f;
import p510sq.C26365a;

/* renamed from: com.zing.zalo.ui.mycloud.b */
/* loaded from: classes6.dex */
public interface InterfaceC12508b {

    /* renamed from: com.zing.zalo.ui.mycloud.b$a */
    /* loaded from: classes6.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m70302a(InterfaceC12508b interfaceC12508b, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    z11 = false;
                }
                interfaceC12508b.mo70148J(z11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDefaultTab");
        }
    }

    /* renamed from: A */
    void mo70135A(float f11);

    /* renamed from: A0 */
    void mo70136A0(C26365a c26365a);

    /* renamed from: B */
    void mo70137B(AnimationTarget animationTarget, C17945a0 c17945a0, boolean z11, C17391z c17391z);

    /* renamed from: C */
    void mo70138C(ArrayList arrayList, String str, String str2);

    /* renamed from: D */
    void mo70139D(Bundle bundle);

    /* renamed from: E */
    void mo70140E();

    /* renamed from: F */
    void mo70142F(ArrayList arrayList, String str);

    /* renamed from: G */
    void mo70143G();

    /* renamed from: H */
    void mo70145H(C17945a0 c17945a0);

    /* renamed from: I */
    boolean mo70146I(MessageId messageId);

    /* renamed from: J */
    void mo70148J(boolean z11);

    /* renamed from: K */
    void mo70149K();

    /* renamed from: L */
    void mo70150L(List list);

    /* renamed from: M */
    void mo70151M();

    /* renamed from: N */
    void mo70152N(MyCloudMessageItem myCloudMessageItem);

    /* renamed from: O */
    void mo70153O();

    /* renamed from: P */
    void mo70154P(String str);

    /* renamed from: Q */
    void mo70155Q();

    /* renamed from: R */
    void mo70156R();

    /* renamed from: S */
    boolean mo70158S(View view);

    /* renamed from: T */
    void mo70160T();

    /* renamed from: U */
    void mo70162U(String str, double d11, double d12);

    /* renamed from: W */
    void mo70165W(C20556f c20556f);

    /* renamed from: a */
    void mo70170a(String str);

    /* renamed from: b */
    void mo70171b(boolean z11, boolean z12);

    /* renamed from: c */
    void mo70172c();

    /* renamed from: d */
    void mo70174d();

    /* renamed from: e */
    void mo70176e();

    /* renamed from: f */
    void mo70178f(String str, ChatOpenParam chatOpenParam);

    /* renamed from: g */
    void mo70180g(MyCloudMessageItem myCloudMessageItem, AnimationTarget animationTarget, String str);

    int getCollapsableHeaderHeight();

    float getCollapsableHeaderTranslationY();

    C11598e.e getCurrMyCloudChatMode();

    int getMultiSelectBottomViewHeight();

    /* renamed from: h */
    boolean mo70182h(C17945a0 c17945a0);

    /* renamed from: i */
    void mo70183i(String str, List list);

    /* renamed from: j */
    void mo70184j(C17945a0 c17945a0);

    /* renamed from: k */
    void mo70185k(String str, Bundle bundle);

    /* renamed from: l */
    void mo70186l(boolean z11, String str, boolean z12);

    /* renamed from: m */
    void mo70187m(List list);

    /* renamed from: n */
    void mo70188n(List list);

    /* renamed from: p */
    void mo70189p(String str, ChatOpenParam chatOpenParam);

    /* renamed from: q */
    void mo70190q();

    /* renamed from: r */
    void mo70191r(boolean z11);

    /* renamed from: s */
    void mo70192s(List list);

    /* renamed from: s4 */
    void mo70193s4(int i11);

    void setKeepScreenOn(boolean z11);

    /* renamed from: u */
    void mo70194u(ArrayList arrayList);

    /* renamed from: v */
    void mo70195v();

    /* renamed from: w */
    void mo70196w();

    /* renamed from: y */
    void mo70197y();

    /* renamed from: z */
    void mo70198z(boolean z11, List list);
}
