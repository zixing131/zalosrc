package com.zing.zalo.p077ui.mediastore;

import android.view.View;
import ci.C3508j;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mediastore.MediaStoreBasePage;
import com.zing.zalo.p077ui.mediastore.MediaStoreView;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreQuickSearchListView;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSearchPage;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSuggestSearchView;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import java.util.List;
import java.util.Map;
import p205hc.InterfaceC19967f;
import p716zh.C31862c;

/* renamed from: com.zing.zalo.ui.mediastore.f */
/* loaded from: classes6.dex */
public interface InterfaceC12361f extends InterfaceC19967f {

    /* renamed from: com.zing.zalo.ui.mediastore.f$a */
    /* loaded from: classes6.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m69488a(InterfaceC12361f interfaceC12361f, int i11, String str, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 2) != 0) {
                    str = "";
                }
                interfaceC12361f.mo69334P8(i11, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setViewPagerNewTab");
        }
    }

    /* renamed from: B7 */
    void mo69309B7();

    /* renamed from: Bb */
    void mo69310Bb(boolean z11, ActionBarMenuItem.C17435d c17435d);

    /* renamed from: Bd */
    void mo69311Bd(CreateMediaStoreParam createMediaStoreParam, List list, MediaStoreBasePage.InterfaceC12276c interfaceC12276c, MediaStoreBasePage.InterfaceC12275b interfaceC12275b);

    /* renamed from: Bm */
    void mo69312Bm(C3508j c3508j, String str);

    /* renamed from: C4 */
    void mo69313C4(boolean z11);

    /* renamed from: Dq */
    void mo69314Dq(boolean z11, C31862c c31862c);

    /* renamed from: Dt */
    boolean mo69315Dt(int i11);

    /* renamed from: ED */
    void mo69316ED(boolean z11);

    /* renamed from: Ek */
    void mo69317Ek(C3508j c3508j, String str);

    /* renamed from: Ez */
    void mo69318Ez(int i11);

    /* renamed from: F3 */
    void mo69319F3(boolean z11);

    /* renamed from: FE */
    void mo69320FE(String str, MessageId messageId);

    /* renamed from: G5 */
    void mo69321G5();

    /* renamed from: GB */
    void mo69322GB(MediaStoreView.C12327b c12327b);

    /* renamed from: IG */
    void mo69323IG(boolean z11, MediaStoreView.C12327b c12327b);

    /* renamed from: Ij */
    void mo69324Ij(String str, String str2);

    /* renamed from: Jj */
    void mo69325Jj();

    /* renamed from: Ki */
    void mo69326Ki(List list, Map map);

    /* renamed from: Kq */
    void mo69327Kq(String str);

    /* renamed from: LG */
    void mo69328LG(boolean z11, MediaStoreSuggestSearchView.InterfaceC12401d interfaceC12401d);

    /* renamed from: M3 */
    NestedScrollViewParent mo69329M3();

    /* renamed from: MC */
    void mo69330MC(String str);

    /* renamed from: O5 */
    String mo69331O5();

    /* renamed from: O8 */
    void mo69332O8();

    /* renamed from: OD */
    View mo69333OD();

    /* renamed from: P8 */
    void mo69334P8(int i11, String str);

    /* renamed from: Rb */
    int mo69335Rb();

    /* renamed from: Rx */
    void mo69336Rx();

    /* renamed from: S3 */
    void mo69337S3(boolean z11);

    /* renamed from: SE */
    void mo69338SE();

    /* renamed from: Uu */
    int mo69339Uu();

    /* renamed from: WH */
    void mo69340WH();

    /* renamed from: X5 */
    void mo69341X5(boolean z11);

    /* renamed from: Xz */
    void mo69342Xz(String str);

    /* renamed from: Z5 */
    void mo69343Z5(String str);

    /* renamed from: ab */
    void mo69344ab();

    /* renamed from: ap */
    void mo69345ap();

    /* renamed from: bc */
    void mo69346bc();

    /* renamed from: da */
    void mo69347da(boolean z11);

    /* renamed from: dn */
    void mo69348dn();

    /* renamed from: eb */
    void mo69349eb(List list, MediaStoreQuickSearchListView.InterfaceC12387a interfaceC12387a, boolean z11);

    /* renamed from: fe */
    void mo69350fe(boolean z11);

    /* renamed from: g */
    void mo69351g();

    /* renamed from: if */
    void mo69352if();

    /* renamed from: ip */
    void mo69353ip(boolean z11, MediaStoreView.C12327b c12327b);

    /* renamed from: iw */
    void mo69354iw(boolean z11);

    /* renamed from: jF */
    void mo69355jF();

    /* renamed from: jq */
    void mo69356jq(boolean z11);

    /* renamed from: ju */
    int mo69357ju();

    /* renamed from: kG */
    void mo69358kG(boolean z11);

    /* renamed from: l9 */
    void mo69359l9(String str);

    /* renamed from: mI */
    boolean mo69360mI();

    /* renamed from: n4 */
    void mo69361n4(int i11, boolean z11, boolean z12);

    /* renamed from: nd */
    void mo69362nd(String str);

    /* renamed from: o8 */
    void mo69363o8(boolean z11);

    /* renamed from: pE */
    int mo69364pE();

    /* renamed from: qf */
    void mo69365qf(int i11, int i12);

    /* renamed from: rk */
    void mo69366rk(boolean z11, boolean z12, String str, boolean z13);

    /* renamed from: sc */
    MediaStoreSuggestSearchView.EnumC12400c mo69367sc();

    /* renamed from: tj */
    void mo69368tj(String str);

    /* renamed from: us */
    void mo69370us();

    /* renamed from: yA */
    MediaStoreSearchPage.EnumC12391a mo69371yA();

    /* renamed from: yl */
    void mo69372yl(boolean z11);

    /* renamed from: ym */
    void mo69373ym();

    /* renamed from: z9 */
    void mo69374z9(boolean z11);

    /* renamed from: zA */
    void mo69375zA(String str);

    /* renamed from: zH */
    int mo69376zH();

    /* renamed from: zm */
    void mo69377zm(boolean z11, MediaStoreView.C12328c c12328c);
}
