package com.zing.zalo.p077ui.call.settingringtone;

import ag0.C0815e1;
import android.content.Context;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import g50.C19231d;
import h50.C19881b;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import lo0.AbstractC22609k0;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p348mi.AbstractC23304d;
import p361nb.C23648e;
import p649xl.C29965ob;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class SettingRingtoneView extends SlidableZaloView {

    /* renamed from: P0 */
    private C29965ob f56329P0;

    /* renamed from: Q0 */
    private LinearLayoutManager f56330Q0;

    /* renamed from: R0 */
    private C19231d f56331R0;

    /* renamed from: S0 */
    private List f56332S0 = new ArrayList();

    /* renamed from: T0 */
    private boolean f56333T0;

    /* renamed from: U0 */
    private final CoroutineExceptionHandler f56334U0;

    /* renamed from: V0 */
    private final CoroutineScope f56335V0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.SettingRingtoneView$a */
    /* loaded from: classes5.dex */
    public static final class C11200a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56336t;

        /* renamed from: u */
        final /* synthetic */ Context f56337u;

        /* renamed from: v */
        final /* synthetic */ SettingRingtoneView f56338v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11200a(Context context, SettingRingtoneView settingRingtoneView, Continuation continuation) {
            super(2, continuation);
            this.f56337u = context;
            this.f56338v = settingRingtoneView;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11200a(this.f56337u, this.f56338v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56336t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (AbstractC23304d.f113291J1.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    RingtoneManager ringtoneManager = new RingtoneManager(this.f56337u);
                    ringtoneManager.setType(1);
                    Cursor cursor = ringtoneManager.getCursor();
                    while (cursor.moveToNext()) {
                        Uri uri = Uri.EMPTY;
                        if (ringtoneManager.getRingtoneUri(cursor.getPosition()) != null) {
                            uri = ringtoneManager.getRingtoneUri(cursor.getPosition());
                        }
                        String string = cursor.getString(1);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        AbstractC19074t.m100205c(uri);
                        arrayList.add(new C19881b(string, 2, uri));
                    }
                    cursor.close();
                    AbstractC23304d.f113291J1.addAll(arrayList);
                }
                List list = this.f56338v.f56332S0;
                ArrayList arrayList2 = AbstractC23304d.f113291J1;
                AbstractC19074t.m100207e(arrayList2, "listRingtones");
                list.addAll(arrayList2);
                this.f56338v.f56333T0 = true;
                SettingRingtoneView settingRingtoneView = this.f56338v;
                this.f56336t = 1;
                if (settingRingtoneView.m58724oM(this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11200a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.SettingRingtoneView$b */
    /* loaded from: classes5.dex */
    public static final class C11201b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56339t;

        C11201b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11201b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f56339t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    List list = SettingRingtoneView.this.f56332S0;
                    SettingRingtoneView settingRingtoneView = SettingRingtoneView.this;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.zalo);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    Uri parse = Uri.parse(AbstractC22609k0.f110725a);
                    AbstractC19074t.m100207e(parse, "parse(...)");
                    list.add(new C19881b(m118743r0, 0, parse));
                    Uri m58718lM = settingRingtoneView.m58718lM();
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_base_on_system_ringtone);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    list.add(new C19881b(m118743r02, 1, m58718lM));
                    this.f56339t = 1;
                    if (settingRingtoneView.m58724oM(this) == m142578e) {
                        return m142578e;
                    }
                }
                SettingRingtoneView settingRingtoneView2 = SettingRingtoneView.this;
                settingRingtoneView2.m58722jM(settingRingtoneView2.getContext());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11201b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.SettingRingtoneView$c */
    /* loaded from: classes5.dex */
    public static final class C11202c extends AbstractC27310a implements CoroutineExceptionHandler {
        public C11202c(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC23350e.m122774d("SettingRingtoneView", "Failed " + th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.SettingRingtoneView$d */
    /* loaded from: classes5.dex */
    public static final class C11203d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56341t;

        C11203d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11203d(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f56341t == 0) {
                AbstractC24862s.m129228b(obj);
                C19231d m58723kM = SettingRingtoneView.this.m58723kM();
                if (m58723kM != null) {
                    m58723kM.m100901S(SettingRingtoneView.this.f56332S0);
                }
                C19231d m58723kM2 = SettingRingtoneView.this.m58723kM();
                if (m58723kM2 != null) {
                    m58723kM2.m10008p();
                    return C24848g0.f119245a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11203d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public SettingRingtoneView() {
        C11202c c11202c = new C11202c(CoroutineExceptionHandler.f105837l);
        this.f56334U0 = c11202c;
        this.f56335V0 = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)).mo112823d0(c11202c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public final Uri m58718lM() {
        try {
            Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(getContext(), 1);
            AbstractC19074t.m100207e(actualDefaultRingtoneUri, "getActualDefaultRingtoneUri(...)");
            return actualDefaultRingtoneUri;
        } catch (Exception e11) {
            Uri uri = Uri.EMPTY;
            AbstractC19074t.m100207e(uri, "EMPTY");
            e11.printStackTrace();
            return uri;
        }
    }

    /* renamed from: mM */
    private final void m58719mM() {
        BuildersKt__Builders_commonKt.m112540d(this.f56335V0, null, null, new C11201b(null), 3, null);
    }

    /* renamed from: nM */
    private final void m58720nM(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        try {
            View inflate = layoutInflater.inflate(AbstractC7409c0.setting_call_ringtone, viewGroup, false);
            this.f56330Q0 = new LinearLayoutManager(this.f72421L0.getContext());
            this.f56331R0 = new C19231d();
            C29965ob m148331a = C29965ob.m148331a(inflate);
            AbstractC19074t.m100207e(m148331a, "bind(...)");
            RecyclerView recyclerView = m148331a.f138895q;
            recyclerView.setAdapter(this.f56331R0);
            LinearLayoutManager linearLayoutManager = this.f56330Q0;
            if (linearLayoutManager == null) {
                AbstractC19074t.m100223u("linearLayoutManager");
                linearLayoutManager = null;
            }
            recyclerView.setLayoutManager(linearLayoutManager);
            this.f56329P0 = m148331a;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pM */
    private final void m58721pM() {
        if (!this.f56333T0) {
            return;
        }
        for (C19881b c19881b : this.f56332S0) {
            if (c19881b.m103568a() == 1) {
                c19881b.m103571d(m58718lM());
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        m58720nM(layoutInflater, viewGroup);
        m58719mM();
        C29965ob c29965ob = this.f56329P0;
        if (c29965ob == null) {
            AbstractC19074t.m100223u("binding");
            c29965ob = null;
        }
        LinearLayout root = c29965ob.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C19231d c19231d = this.f56331R0;
        if (c19231d != null) {
            c19231d.m100902T();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String str;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 == null || (str = m92642L3.getString("SOURCE_OPEN_SETTING_RING_TONE_SCREEN")) == null) {
            str = "";
        }
        C0815e1.m2075D().m2100V(new C23648e(28, "setting_call", 1, "call_setting_ringtone_view", str, "1"), false);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingRingtoneView";
    }

    /* renamed from: jM */
    public final void m58722jM(Context context) {
        BuildersKt__Builders_commonKt.m112540d(this.f56335V0, null, null, new C11200a(context, this, null), 3, null);
    }

    /* renamed from: kM */
    public final C19231d m58723kM() {
        return this.f56331R0;
    }

    /* renamed from: oM */
    public final Object m58724oM(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112681c(), new C11203d(null), continuation);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m58721pM();
    }
}
