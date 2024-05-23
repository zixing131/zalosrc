package com.zing.zalo.p077ui.mycloud;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mycloud.MyCloudMultiSelectBottomView;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import java.util.List;
import java.util.Map;
import mw.EnumC23460e;

/* renamed from: com.zing.zalo.ui.mycloud.a */
/* loaded from: classes6.dex */
public interface InterfaceC12507a {

    /* renamed from: com.zing.zalo.ui.mycloud.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m70301a(InterfaceC12507a interfaceC12507a, int i11, boolean z11, boolean z12, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 1) != 0) {
                    i11 = -1;
                }
                if ((i12 & 2) != 0) {
                    z11 = false;
                }
                if ((i12 & 4) != 0) {
                    z12 = false;
                }
                interfaceC12507a.mo70294f4(i11, z11, z12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkShowHideLayoutProgressSyncMsg");
        }
    }

    /* renamed from: A */
    void mo70276A();

    /* renamed from: A1 */
    void mo70277A1();

    /* renamed from: Q */
    boolean mo70278Q();

    /* renamed from: R3 */
    void mo70279R3(String str, List list);

    /* renamed from: S3 */
    String mo70280S3();

    /* renamed from: T3 */
    void mo70281T3(EnumC23460e enumC23460e, boolean z11);

    /* renamed from: U3 */
    int mo70282U3();

    /* renamed from: V3 */
    void mo70283V3(List list);

    /* renamed from: W3 */
    EnumC23460e mo70284W3();

    /* renamed from: X3 */
    BaseMyCloudTabView.AbstractC12510b mo70285X3();

    /* renamed from: Y3 */
    void mo70286Y3(int i11);

    /* renamed from: Z3 */
    void mo70287Z3();

    /* renamed from: a0 */
    Map mo70288a0();

    /* renamed from: a4 */
    void mo70289a4(int i11, int i12, int i13);

    /* renamed from: b4 */
    MyCloudMultiSelectBottomView.InterfaceC12492b mo70290b4();

    /* renamed from: c4 */
    String mo70291c4();

    /* renamed from: d4 */
    void mo70292d4(int i11, int i12);

    /* renamed from: e4 */
    void mo70293e4(boolean z11, boolean z12);

    /* renamed from: f4 */
    void mo70294f4(int i11, boolean z11, boolean z12);

    /* renamed from: g4 */
    void mo70295g4();

    /* renamed from: h4 */
    void mo70296h4();

    /* renamed from: i0 */
    boolean mo70297i0();

    /* renamed from: i4 */
    int mo70298i4(MessageId messageId, List list);

    /* renamed from: j4 */
    void mo70299j4();

    void onDetachedFromWindow();

    /* renamed from: x */
    void mo70300x(int i11, Object... objArr);
}
