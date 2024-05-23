package com.zing.zalo.p077ui.call;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bp0.AbstractC3096i0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.call.SettingCallLogsView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g50.C19229b;
import h50.C19880a;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import mm0.AbstractC23350e;
import p542ub.InterfaceC27218a;
import p649xl.C29727b7;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class SettingCallLogsView extends SlidableZaloView {

    /* renamed from: P0 */
    private C29727b7 f56267P0;

    /* renamed from: Q0 */
    private LinearLayoutManager f56268Q0;

    /* renamed from: R0 */
    private C19229b f56269R0;

    /* renamed from: S0 */
    private List f56270S0 = new ArrayList();

    /* renamed from: T0 */
    private final CoroutineExceptionHandler f56271T0;

    /* renamed from: U0 */
    private final CoroutineScope f56272U0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.SettingCallLogsView$a */
    /* loaded from: classes5.dex */
    public static final class C11187a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final C11187a f56273q = new C11187a();

        C11187a() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo240pC(File file, File file2) {
            return Integer.valueOf(AbstractC19074t.m100210h(file2.lastModified(), file.lastModified()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.SettingCallLogsView$b */
    /* loaded from: classes5.dex */
    public static final class C11188b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56274t;

        C11188b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11188b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56274t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    SettingCallLogsView.this.m58653uM();
                    SettingCallLogsView settingCallLogsView = SettingCallLogsView.this;
                    this.f56274t = 1;
                    if (settingCallLogsView.m58658HM(this) == m142578e) {
                        return m142578e;
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11188b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.SettingCallLogsView$c */
    /* loaded from: classes5.dex */
    public static final class C11189c implements C19229b.b {
        C11189c() {
        }

        @Override // g50.C19229b.b
        /* renamed from: a */
        public void mo58662a(int i11) {
            SettingCallLogsView.this.m58655xM(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.SettingCallLogsView$d */
    /* loaded from: classes5.dex */
    public static final class C11190d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56277t;

        C11190d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11190d(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Set set;
            Set m100885M;
            int i11;
            Set m100885M2;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f56277t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                SettingCallLogsView settingCallLogsView = SettingCallLogsView.this;
                C19229b m58659wM = settingCallLogsView.m58659wM();
                if (m58659wM != null) {
                    set = m58659wM.m100885M();
                } else {
                    set = null;
                }
                settingCallLogsView.m58649qM(set);
                C19229b m58659wM2 = SettingCallLogsView.this.m58659wM();
                if (m58659wM2 != null && (m100885M = m58659wM2.m100885M()) != null) {
                    m100885M.clear();
                }
                SettingCallLogsView settingCallLogsView2 = SettingCallLogsView.this;
                this.f56277t = 1;
                if (settingCallLogsView2.m58658HM(this) == m142578e) {
                    return m142578e;
                }
            }
            SettingCallLogsView settingCallLogsView3 = SettingCallLogsView.this;
            C19229b m58659wM3 = settingCallLogsView3.m58659wM();
            if (m58659wM3 != null && (m100885M2 = m58659wM3.m100885M()) != null) {
                i11 = m100885M2.size();
            } else {
                i11 = 0;
            }
            settingCallLogsView3.m58655xM(i11);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11190d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.SettingCallLogsView$e */
    /* loaded from: classes5.dex */
    public static final class C11191e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56279t;

        C11191e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11191e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Set set;
            Set m100885M;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56279t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SettingCallLogsView settingCallLogsView = SettingCallLogsView.this;
                C19229b m58659wM = settingCallLogsView.m58659wM();
                if (m58659wM != null) {
                    set = m58659wM.m100885M();
                } else {
                    set = null;
                }
                this.f56279t = 1;
                if (settingCallLogsView.m58636EM(set, this) == m142578e) {
                    return m142578e;
                }
            }
            C19229b m58659wM2 = SettingCallLogsView.this.m58659wM();
            if (m58659wM2 != null && (m100885M = m58659wM2.m100885M()) != null) {
                m100885M.clear();
            }
            SettingCallLogsView settingCallLogsView2 = SettingCallLogsView.this;
            this.f56279t = 2;
            if (settingCallLogsView2.m58658HM(this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11191e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.SettingCallLogsView$f */
    /* loaded from: classes5.dex */
    public static final class C11192f extends AbstractC27310a implements CoroutineExceptionHandler {
        public C11192f(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC23350e.m122774d("SettingCallLogsView", "Failed " + th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.SettingCallLogsView$g */
    /* loaded from: classes5.dex */
    public static final class C11193g extends AbstractC29096d {

        /* renamed from: s */
        Object f56281s;

        /* renamed from: t */
        /* synthetic */ Object f56282t;

        /* renamed from: v */
        int f56284v;

        C11193g(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f56282t = obj;
            this.f56284v |= Integer.MIN_VALUE;
            return SettingCallLogsView.this.m58637FM(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.SettingCallLogsView$h */
    /* loaded from: classes5.dex */
    public static final class C11194h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56285t;

        C11194h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11194h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f56285t == 0) {
                AbstractC24862s.m129228b(obj);
                return Toast.makeText(SettingCallLogsView.this.getContext(), AbstractC23136l9.m118743r0(AbstractC8020f0.deliveried_message_send_fail), 0);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11194h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.SettingCallLogsView$i */
    /* loaded from: classes5.dex */
    public static final class C11195i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56287t;

        C11195i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11195i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f56287t == 0) {
                AbstractC24862s.m129228b(obj);
                C19229b m58659wM = SettingCallLogsView.this.m58659wM();
                if (m58659wM != null) {
                    m58659wM.m100889R(SettingCallLogsView.this.f56270S0);
                }
                C19229b m58659wM2 = SettingCallLogsView.this.m58659wM();
                if (m58659wM2 != null) {
                    m58659wM2.m10008p();
                    return C24848g0.f119245a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11195i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public SettingCallLogsView() {
        C11192f c11192f = new C11192f(CoroutineExceptionHandler.f105837l);
        this.f56271T0 = c11192f;
        this.f56272U0 = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)).mo112823d0(c11192f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static final void m58632AM(SettingCallLogsView settingCallLogsView, View view) {
        AbstractC19074t.m100208f(settingCallLogsView, "this$0");
        settingCallLogsView.m58634CM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m58633BM(SettingCallLogsView settingCallLogsView, View view) {
        AbstractC19074t.m100208f(settingCallLogsView, "this$0");
        settingCallLogsView.m58635DM();
    }

    /* renamed from: CM */
    private final Job m58634CM() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f56272U0, null, null, new C11190d(null), 3, null);
        return m112540d;
    }

    /* renamed from: DM */
    private final Job m58635DM() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f56272U0, null, null, new C11191e(null), 3, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public final Object m58636EM(Set set, Continuation continuation) {
        Object m142578e;
        Object m58637FM = m58637FM(set, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m58637FM == m142578e) {
            return m58637FM;
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: FM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m58637FM(Set set, Continuation continuation) {
        C11193g c11193g;
        Object m142578e;
        int i11;
        if (continuation instanceof C11193g) {
            c11193g = (C11193g) continuation;
            int i12 = c11193g.f56284v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c11193g.f56284v = i12 - Integer.MIN_VALUE;
                Object obj = c11193g.f56282t;
                m142578e = AbstractC28298d.m142578e();
                i11 = c11193g.f56284v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        e = (Exception) c11193g.f56281s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                    } catch (Exception e11) {
                        e = e11;
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        C11194h c11194h = new C11194h(null);
                        c11193g.f56281s = e;
                        c11193g.f56284v = 1;
                        if (BuildersKt.m112534g(m112681c, c11194h, c11193g) == m142578e) {
                            return m142578e;
                        }
                    }
                    if (set == null) {
                        return C24848g0.f119245a;
                    }
                    final Bundle bundle = new Bundle();
                    bundle.putBoolean("bol_share_in_app", true);
                    bundle.putBoolean("btn_extra_show_hide_post_feed", true);
                    bundle.putInt("extra_source_log", 1);
                    if (AbstractC23165o5.m119333b()) {
                        bundle.putBoolean("specialToShowPassCodeScreen", true);
                    }
                    bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                    ArrayList<String> arrayList = new ArrayList<>();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C19880a) it.next()).m103567b());
                    }
                    if (arrayList.size() > 0) {
                        if (arrayList.size() > 1) {
                            bundle.putStringArrayList("extra_multi_data_path", arrayList);
                        } else {
                            String str = arrayList.get(0);
                            AbstractC19074t.m100207e(str, "get(...)");
                            bundle.putSerializable("extra_data_path", str);
                        }
                    }
                    bundle.putBoolean("extra_show_dialog_file_limit", false);
                    InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                    if (m92676n2 != null) {
                        m92676n2.runOnUiThread(new Runnable() { // from class: f50.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingCallLogsView.m58638GM(SettingCallLogsView.this, bundle);
                            }
                        });
                    }
                    return C24848g0.f119245a;
                }
                e.printStackTrace();
                return C24848g0.f119245a;
            }
        }
        c11193g = new C11193g(continuation);
        Object obj2 = c11193g.f56282t;
        m142578e = AbstractC28298d.m142578e();
        i11 = c11193g.f56284v;
        if (i11 == 0) {
        }
        e.printStackTrace();
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m58638GM(SettingCallLogsView settingCallLogsView, Bundle bundle) {
        AbstractC19074t.m100208f(settingCallLogsView, "this$0");
        AbstractC19074t.m100208f(bundle, "$bundle");
        C17487o0 m92662fJ = settingCallLogsView.f72421L0.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(ShareView.class, bundle, 0, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public final void m58649qM(Set set) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C19880a c19880a = (C19880a) it.next();
                if (m58650rM(c19880a.m103567b())) {
                    this.f56270S0.remove(c19880a);
                }
            }
        }
    }

    /* renamed from: rM */
    private final boolean m58650rM(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: sM */
    private final void m58651sM() {
        C29727b7 c29727b7 = this.f56267P0;
        C29727b7 c29727b72 = null;
        if (c29727b7 == null) {
            AbstractC19074t.m100223u("binding");
            c29727b7 = null;
        }
        c29727b7.f137312s.setEnabled(false);
        C29727b7 c29727b73 = this.f56267P0;
        if (c29727b73 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29727b72 = c29727b73;
        }
        c29727b72.f137313t.setEnabled(false);
    }

    /* renamed from: tM */
    private final void m58652tM() {
        C29727b7 c29727b7 = this.f56267P0;
        C29727b7 c29727b72 = null;
        if (c29727b7 == null) {
            AbstractC19074t.m100223u("binding");
            c29727b7 = null;
        }
        c29727b7.f137312s.setEnabled(true);
        C29727b7 c29727b73 = this.f56267P0;
        if (c29727b73 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29727b72 = c29727b73;
        }
        c29727b72.f137313t.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public final void m58653uM() {
        this.f56270S0.clear();
        File m15493I = AbstractC3096i0.m15493I(getContext());
        AbstractC19074t.m100207e(m15493I, "getRecordNWFolder(...)");
        File[] listFiles = m15493I.listFiles();
        if (listFiles == null) {
            return;
        }
        final C11187a c11187a = C11187a.f56273q;
        Arrays.sort(listFiles, new Comparator() { // from class: f50.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m58654vM;
                m58654vM = SettingCallLogsView.m58654vM(InterfaceC18509p.this, obj, obj2);
                return m58654vM;
            }
        });
        for (File file : listFiles) {
            List list = this.f56270S0;
            String name = file.getName();
            AbstractC19074t.m100207e(name, "getName(...)");
            String absolutePath = file.getAbsolutePath();
            AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
            list.add(new C19880a(name, absolutePath));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static final int m58654vM(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public final void m58655xM(int i11) {
        if (i11 > 0) {
            m58652tM();
        } else {
            m58651sM();
        }
    }

    /* renamed from: yM */
    private final void m58656yM() {
        BuildersKt__Builders_commonKt.m112540d(this.f56272U0, null, null, new C11188b(null), 3, null);
    }

    /* renamed from: zM */
    private final void m58657zM(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Set m100885M;
        try {
            int i11 = 0;
            View inflate = layoutInflater.inflate(AbstractC7409c0.layout_setting_call_logs, viewGroup, false);
            this.f56268Q0 = new LinearLayoutManager(this.f72421L0.getContext());
            C19229b c19229b = new C19229b();
            this.f56269R0 = c19229b;
            c19229b.m100890S(new C11189c());
            C29727b7 m147764a = C29727b7.m147764a(inflate);
            AbstractC19074t.m100207e(m147764a, "bind(...)");
            RecyclerView recyclerView = m147764a.f137311r;
            recyclerView.setAdapter(this.f56269R0);
            LinearLayoutManager linearLayoutManager = this.f56268Q0;
            C29727b7 c29727b7 = null;
            if (linearLayoutManager == null) {
                AbstractC19074t.m100223u("linearLayoutManager");
                linearLayoutManager = null;
            }
            recyclerView.setLayoutManager(linearLayoutManager);
            this.f56267P0 = m147764a;
            m147764a.f137312s.setOnClickListener(new View.OnClickListener() { // from class: f50.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingCallLogsView.m58632AM(SettingCallLogsView.this, view);
                }
            });
            C29727b7 c29727b72 = this.f56267P0;
            if (c29727b72 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29727b7 = c29727b72;
            }
            c29727b7.f137313t.setOnClickListener(new View.OnClickListener() { // from class: f50.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingCallLogsView.m58633BM(SettingCallLogsView.this, view);
                }
            });
            C19229b c19229b2 = this.f56269R0;
            if (c19229b2 != null && (m100885M = c19229b2.m100885M()) != null) {
                i11 = m100885M.size();
            }
            m58655xM(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        m58657zM(layoutInflater, viewGroup);
        C29727b7 c29727b7 = this.f56267P0;
        if (c29727b7 == null) {
            AbstractC19074t.m100223u("binding");
            c29727b7 = null;
        }
        RelativeLayout root = c29727b7.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: HM */
    public final Object m58658HM(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112681c(), new C11195i(null), continuation);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingCallLogsView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m58656yM();
    }

    /* renamed from: wM */
    public final C19229b m58659wM() {
        return this.f56269R0;
    }
}
