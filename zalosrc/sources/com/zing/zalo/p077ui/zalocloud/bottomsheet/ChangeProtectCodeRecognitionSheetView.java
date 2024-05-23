package com.zing.zalo.p077ui.zalocloud.bottomsheet;

import android.os.Bundle;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import sc.C26220b;
import tg0.C26676b;

/* loaded from: classes6.dex */
public final class ChangeProtectCodeRecognitionSheetView extends ZdsModalBottomSheet {
    public static final C13825a Companion = new C13825a(null);

    /* renamed from: S0 */
    private static final ConcurrentHashMap f71506S0;

    /* renamed from: T0 */
    private static final MutableStateFlow f71507T0;

    /* renamed from: U0 */
    private static final StateFlow f71508U0;

    /* renamed from: com.zing.zalo.ui.zalocloud.bottomsheet.ChangeProtectCodeRecognitionSheetView$a */
    /* loaded from: classes6.dex */
    public static final class C13825a {
        private C13825a() {
        }

        public /* synthetic */ C13825a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m77096a() {
            m77099d().mo113433d(Boolean.FALSE);
            m77102g("User click clearConfirm: currentState: " + m77099d().getValue());
        }

        /* renamed from: b */
        public final void m77097b() {
            m77099d().mo113433d(Boolean.TRUE);
            m77102g("User click confirm: currentState: " + m77099d().getValue());
        }

        /* renamed from: c */
        public final void m77098c(C17487o0 c17487o0) {
            AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
            ZaloView m92993D0 = c17487o0.m92993D0(ChangeProtectCodeRecognitionSheetView.class);
            if (m92993D0 != null) {
                m92993D0.finish();
            }
        }

        /* renamed from: d */
        public final MutableStateFlow m77099d() {
            return ChangeProtectCodeRecognitionSheetView.f71507T0;
        }

        /* renamed from: e */
        public final StateFlow m77100e() {
            return ChangeProtectCodeRecognitionSheetView.f71508U0;
        }

        /* renamed from: f */
        public final boolean m77101f() {
            return AbstractC19074t.m100204b(m77100e().getValue(), Boolean.TRUE);
        }

        /* renamed from: g */
        public final void m77102g(String str) {
            AbstractC19074t.m100208f(str, "str");
            C26220b.m134827j(str, null, 2, null);
        }

        /* renamed from: h */
        public final void m77103h(C17487o0 c17487o0) {
            AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
            try {
                c17487o0.m93069k2(ChangeProtectCodeRecognitionSheetView.class, new Bundle(), 1, false);
                m77099d().mo113433d(null);
            } catch (Exception e11) {
                C26676b.m136954d("SMLChangeProtectCodeRecognitionSheetView.kt", e11);
            }
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f71506S0 = concurrentHashMap;
        String str = CoreUtility.f89233i;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            MutableStateFlow m113503a = StateFlowKt.m113503a(null);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str, m113503a);
            if (putIfAbsent == null) {
                obj = m113503a;
            } else {
                obj = putIfAbsent;
            }
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) obj;
        f71507T0 = mutableStateFlow;
        AbstractC19074t.m100207e(mutableStateFlow, "currentState");
        f71508U0 = FlowKt.m113284b(mutableStateFlow);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new ChangeProtectCodeRecognitionSheet();
    }
}
