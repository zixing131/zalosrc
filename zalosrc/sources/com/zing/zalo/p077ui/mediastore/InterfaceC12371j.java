package com.zing.zalo.p077ui.mediastore;

import android.os.Bundle;
import au.EnumC2381y;
import au.EnumC2382z;
import ci.C3526u;
import com.zing.zalo.adapters.C7226u3;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p077ui.mediastore.C12340b;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zview.animation.AnimationTarget;
import java.util.List;
import p205hc.InterfaceC19967f;
import p239ih.C20556f;
import p354n3.C23528a;
import vc0.AbstractC27964c;
import xl0.InterfaceC30162c;

/* renamed from: com.zing.zalo.ui.mediastore.j */
/* loaded from: classes6.dex */
public interface InterfaceC12371j extends InterfaceC19967f {

    /* renamed from: com.zing.zalo.ui.mediastore.j$a */
    /* loaded from: classes6.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m69543a(InterfaceC12371j interfaceC12371j, Bundle bundle, int i11, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 2) != 0) {
                    i11 = 0;
                }
                interfaceC12371j.mo68920q8(bundle, i11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openShareViewWithBundle");
        }

        /* renamed from: b */
        public static /* synthetic */ void m69544b(InterfaceC12371j interfaceC12371j, long j11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    j11 = 0;
                }
                interfaceC12371j.mo68930ys(j11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMsgDismissLoadingView");
        }

        /* renamed from: c */
        public static /* synthetic */ void m69545c(InterfaceC12371j interfaceC12371j, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    z13 = false;
                }
                interfaceC12371j.mo68865Ed(z11, z12, z13);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLayoutFooter");
        }
    }

    /* renamed from: AC */
    void mo68852AC(MediaStoreItem mediaStoreItem, boolean z11);

    /* renamed from: Aa */
    void mo68854Aa();

    /* renamed from: An */
    void mo68855An(String str, String str2, String str3);

    /* renamed from: Bo */
    boolean mo68858Bo();

    /* renamed from: C2 */
    C23528a mo68859C2();

    /* renamed from: Cz */
    void mo68861Cz(MediaStoreItem mediaStoreItem, int i11);

    /* renamed from: Eb */
    void mo68864Eb();

    /* renamed from: Ed */
    void mo68865Ed(boolean z11, boolean z12, boolean z13);

    /* renamed from: H2 */
    void mo68866H2(AnimationTarget animationTarget, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11);

    /* renamed from: H8 */
    void mo68867H8(Bundle bundle);

    /* renamed from: Ib */
    void mo68869Ib();

    /* renamed from: Jw */
    void mo68871Jw(C7906d c7906d, boolean z11, int i11, boolean z12);

    /* renamed from: K1 */
    void mo68873K1(boolean z11);

    /* renamed from: KA */
    void mo68874KA(Bundle bundle);

    /* renamed from: LB */
    void mo68876LB(MediaStoreItem mediaStoreItem, boolean z11);

    /* renamed from: Ms */
    void mo68879Ms(C3526u c3526u, EnumC2382z enumC2382z);

    /* renamed from: NF */
    void mo68880NF(String str, EnumC2382z enumC2382z, int i11);

    /* renamed from: Oi */
    void mo68882Oi();

    /* renamed from: Op */
    void mo68883Op(String str, List list, C12340b.b bVar);

    /* renamed from: RA */
    void mo68884RA(String str);

    /* renamed from: S9 */
    void mo68885S9();

    /* renamed from: Sw */
    void mo68887Sw();

    /* renamed from: Tb */
    void mo68888Tb();

    /* renamed from: W */
    void mo68892W(C20556f c20556f);

    /* renamed from: W9 */
    void mo68893W9(MultiStateView.EnumC15915f enumC15915f, int i11);

    /* renamed from: WB */
    void mo68894WB(EnumC2382z enumC2382z, List list, int i11, boolean z11, boolean z12, EnumC2381y enumC2381y);

    /* renamed from: Wi */
    int mo68896Wi();

    /* renamed from: Wj */
    void mo68897Wj(String str);

    /* renamed from: Wv */
    boolean mo68898Wv();

    /* renamed from: Yj */
    void mo68900Yj(long j11);

    /* renamed from: c3 */
    void mo68903c3(boolean z11);

    /* renamed from: g6 */
    void mo68909g6(String str, int i11, String str2, int i12);

    /* renamed from: gb */
    void mo68911gb();

    /* renamed from: ge */
    void mo68912ge(AbstractC27964c.a aVar, C7226u3.b bVar);

    /* renamed from: k1 */
    void mo68914k1();

    /* renamed from: ks */
    void mo68915ks();

    /* renamed from: l1 */
    void mo68916l1(int i11);

    /* renamed from: nz */
    void mo68917nz(C7906d c7906d, boolean z11);

    /* renamed from: on */
    boolean mo68918on();

    /* renamed from: pI */
    void mo68919pI(C7906d c7906d, int i11);

    /* renamed from: q8 */
    void mo68920q8(Bundle bundle, int i11);

    /* renamed from: rD */
    void mo68921rD();

    /* renamed from: s2 */
    void mo68922s2(int i11);

    /* renamed from: ui */
    void mo68923ui();

    /* renamed from: x0 */
    boolean mo68926x0();

    /* renamed from: yF */
    void mo68928yF(int i11, MultiStateView.EnumC15914e enumC15914e);

    /* renamed from: ys */
    void mo68930ys(long j11);

    /* renamed from: z */
    void mo68931z(boolean z11, List list);

    /* renamed from: z6 */
    void mo68932z6(List list);
}
