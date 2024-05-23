package ly;

import am.AbstractC0924m0;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.C8010k;
import com.zing.zalo.dialog.QRCodeResultViewDialog;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.PcLoginView;
import com.zing.zalo.p077ui.zviews.ProgressDialogView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.v81;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import ho0.AbstractC20110a;
import java.util.Arrays;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import my.AbstractC23490m;
import org.json.JSONException;
import org.json.JSONObject;
import p006a0.C0012a;
import p363nh.AbstractC23775p0;
import p371nv.C23952g;
import p542ub.InterfaceC27218a;
import p716zh.C31877d;
import th.AbstractC26681b;
import vg.AbstractC28207v1;

/* renamed from: ly.v */
/* loaded from: classes4.dex */
public abstract class AbstractC22687v implements InterfaceC22668c {

    /* renamed from: a */
    private ProgressDialogView f111153a;

    /* renamed from: b */
    private QRCodeResultViewDialog f111154b;

    /* renamed from: ly.v$a */
    /* loaded from: classes4.dex */
    public static final class a implements QRCodeResultViewDialog.InterfaceC7995b {
        a() {
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: a */
        public void mo43049a(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
            if (dialogView.m92687sJ()) {
                dialogView.dismiss();
            }
            AbstractC22687v.this.mo117300s(-1);
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: b */
        public void mo43050b(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
            if (dialogView.m92687sJ()) {
                dialogView.dismiss();
            }
            AbstractC22687v.this.mo117300s(-1);
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: c */
        public void mo43051c(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
        }
    }

    /* renamed from: ly.v$b */
    /* loaded from: classes4.dex */
    public static final class b implements QRCodeResultViewDialog.InterfaceC7995b {

        /* renamed from: b */
        final /* synthetic */ String f111157b;

        b(String str) {
            this.f111157b = str;
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: a */
        public void mo43049a(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
            if (dialogView.m92687sJ()) {
                dialogView.dismiss();
            }
            AbstractC22687v.this.mo117300s(-1);
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: b */
        public void mo43050b(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
            if (dialogView.m92687sJ()) {
                dialogView.dismiss();
            }
            AbstractC22687v.this.mo117300s(-1);
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: c */
        public void mo43051c(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
            if (dialogView.m92687sJ()) {
                try {
                    dialogView.dismiss();
                    AbstractC22687v.this.mo49386u(ZaloWebView.class, ZaloWebView.Companion.m87179u(this.f111157b), -1);
                    AbstractC22687v.this.mo117300s(0);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: ly.v$c */
    /* loaded from: classes4.dex */
    public static final class c implements QRCodeResultViewDialog.InterfaceC7995b {

        /* renamed from: a */
        final /* synthetic */ String f111158a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22687v f111159b;

        c(String str, AbstractC22687v abstractC22687v) {
            this.f111158a = str;
            this.f111159b = abstractC22687v;
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: a */
        public void mo43049a(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
            this.f111159b.mo117300s(-1);
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: b */
        public void mo43050b(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: c */
        public void mo43051c(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
            if (dialogView.m92687sJ()) {
                try {
                    dialogView.dismiss();
                    MainApplication.C6895a c6895a = MainApplication.Companion;
                    Object systemService = c6895a.m35500c().getSystemService("clipboard");
                    AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    C0012a c0012a = new C0012a((ClipboardManager) systemService, new SensitiveData("clipboard_copy_text_qr", "scan_qr", null, 4, null));
                    ClipData newPlainText = ClipData.newPlainText("", this.f111158a);
                    AbstractC19074t.m100205c(newPlainText);
                    c0012a.m16c(newPlainText);
                    if (AbstractC26681b.f126359d) {
                        ToastUtils.showMess(c6895a.m35500c().getString(AbstractC8020f0.str_copied));
                    }
                    this.f111159b.mo117300s(-1);
                } catch (SensitiveDataException unused) {
                    if (AbstractC26681b.f126359d) {
                        ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_sensitive_clipboard_block_title));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: ly.v$d */
    /* loaded from: classes4.dex */
    public static final class d implements QRCodeResultViewDialog.InterfaceC7995b {

        /* renamed from: b */
        final /* synthetic */ String f111161b;

        d(String str) {
            this.f111161b = str;
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: a */
        public void mo43049a(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
            if (dialogView.m92687sJ()) {
                dialogView.dismiss();
            }
            AbstractC22687v.this.mo117300s(-1);
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: b */
        public void mo43050b(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
            if (dialogView.m92687sJ()) {
                dialogView.dismiss();
            }
            AbstractC22687v.this.mo117300s(-1);
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: c */
        public void mo43051c(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
            AbstractC22687v.this.mo117300s(0);
            if (dialogView.m92687sJ()) {
                try {
                    dialogView.dismiss();
                    AbstractC22687v.this.mo49386u(ZaloWebView.class, ZaloWebView.Companion.m87179u(this.f111161b), -1);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: ly.v$e */
    /* loaded from: classes4.dex */
    public static final class e implements QRCodeResultViewDialog.InterfaceC7995b {
        e() {
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: a */
        public void mo43049a(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
            if (dialogView.m92687sJ()) {
                dialogView.dismiss();
            }
            AbstractC22687v.this.mo117300s(-1);
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: b */
        public void mo43050b(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
            if (dialogView.m92687sJ()) {
                dialogView.dismiss();
            }
            AbstractC22687v.this.mo117300s(-1);
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.InterfaceC7995b
        /* renamed from: c */
        public void mo43051c(DialogView dialogView) {
            AbstractC19074t.m100208f(dialogView, "dialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m117319P(AbstractC22687v abstractC22687v) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        BaseZaloView mo49369U = abstractC22687v.mo49369U();
        if (mo49369U != null) {
            mo49369U.mo49315c4();
        }
        ProgressDialogView progressDialogView = abstractC22687v.f111153a;
        if (progressDialogView != null) {
            progressDialogView.dismiss();
        }
        abstractC22687v.f111153a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m117320Q(AbstractC22687v abstractC22687v, int i11) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        try {
            abstractC22687v.mo117297c();
            abstractC22687v.mo49370a(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            abstractC22687v.mo49370a(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static final void m117321V(final AbstractC22687v abstractC22687v) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        try {
            final InterfaceC27218a mo49367R = abstractC22687v.mo49367R();
            if (mo49367R == null) {
                abstractC22687v.mo49376i(-1);
                return;
            }
            C8009j.a aVar = new C8009j.a(mo49367R.getContext());
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.popup_whatsnew_title));
            aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_forceUpdateMsg));
            aVar.m43166o(AbstractC23136l9.m118743r0(AbstractC8020f0.update), new InterfaceC17463d.d() { // from class: ly.j
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    AbstractC22687v.m117322W(InterfaceC27218a.this, interfaceC17463d, i11);
                }
            });
            aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_ignore), new InterfaceC17463d.d() { // from class: ly.k
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    AbstractC22687v.m117323X(AbstractC22687v.this, interfaceC17463d, i11);
                }
            });
            aVar.m43167p(new InterfaceC17463d.c() { // from class: ly.l
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    AbstractC22687v.m117324Y(AbstractC22687v.this, interfaceC17463d);
                }
            });
            if (!mo49367R.isFinishing()) {
                C8009j m43152a = aVar.m43152a();
                AbstractC19074t.m100207e(m43152a, "create(...)");
                m43152a.m92873y(true);
                m43152a.mo13822K();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static final void m117322W(InterfaceC27218a interfaceC27218a, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC27218a, "$activity");
        try {
            Bundle bundle = new Bundle();
            ZaloWebView.Companion.m87171F(interfaceC27218a, "market://details?id=" + interfaceC27218a.getContext().getPackageName(), bundle);
        } catch (ActivityNotFoundException unused) {
            ZaloWebView.Companion.m87171F(interfaceC27218a, "https://play.google.com/store/apps/details?id=" + interfaceC27218a.getContext().getPackageName() + "&feature=search_result", new Bundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static final void m117323X(AbstractC22687v abstractC22687v, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        abstractC22687v.mo49371b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m117324Y(AbstractC22687v abstractC22687v, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        abstractC22687v.mo49371b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m117325a0(AbstractC22687v abstractC22687v) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        try {
            InterfaceC27218a mo49367R = abstractC22687v.mo49367R();
            if (mo49367R == null) {
                abstractC22687v.mo117300s(-1);
                return;
            }
            BaseZaloView mo49369U = abstractC22687v.mo49369U();
            if (mo49369U == null) {
                abstractC22687v.mo117300s(-1);
                return;
            }
            C8010k.a aVar = new C8010k.a(mo49367R.getContext());
            aVar.m43045d(AbstractC8020f0.close);
            aVar.m43048g(AbstractC8020f0.qrcode_notice);
            aVar.m43046e(mo49367R.getString(AbstractC8020f0.qrcode_code_changed));
            aVar.m43044c(new a());
            QRCodeResultViewDialog m43042a = aVar.m43042a();
            abstractC22687v.f111154b = m43042a;
            if (m43042a != null) {
                m43042a.mo43041MK(false);
            }
            QRCodeResultViewDialog qRCodeResultViewDialog = abstractC22687v.f111154b;
            if (qRCodeResultViewDialog != null) {
                qRCodeResultViewDialog.mo83093TK(mo49369U.m92649TI());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static final void m117326c0(AbstractC22687v abstractC22687v, String str, C20096c c20096c) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        AbstractC19074t.m100208f(str, "$link");
        AbstractC19074t.m100208f(c20096c, "$errorMessage");
        InterfaceC27218a mo49367R = abstractC22687v.mo49367R();
        if (mo49367R == null) {
            abstractC22687v.mo117300s(c20096c.m104491c());
            return;
        }
        BaseZaloView mo49369U = abstractC22687v.mo49369U();
        if (mo49369U == null) {
            abstractC22687v.mo117300s(c20096c.m104491c());
            return;
        }
        C8010k.a aVar = new C8010k.a(mo49367R.getContext());
        aVar.m43045d(AbstractC8020f0.str_no);
        aVar.m43047f(AbstractC8020f0.str_yes);
        aVar.m43048g(AbstractC8020f0.qrcode_notice);
        C19067n0 c19067n0 = C19067n0.f94947a;
        String string = mo49367R.getString(AbstractC8020f0.qrcode_check_link_error_do_open);
        AbstractC19074t.m100207e(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        aVar.m43046e(format);
        aVar.m43044c(new b(str));
        QRCodeResultViewDialog m43042a = aVar.m43042a();
        abstractC22687v.f111154b = m43042a;
        if (m43042a != null) {
            m43042a.mo43041MK(false);
        }
        QRCodeResultViewDialog qRCodeResultViewDialog = abstractC22687v.f111154b;
        if (qRCodeResultViewDialog != null) {
            qRCodeResultViewDialog.mo83093TK(mo49369U.m92649TI());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m117327d0(final AbstractC22687v abstractC22687v, boolean z11, String str, final JSONObject jSONObject) {
        int i11;
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        AbstractC19074t.m100208f(str, "$name");
        AbstractC19074t.m100208f(jSONObject, "$item");
        try {
            InterfaceC27218a mo49367R = abstractC22687v.mo49367R();
            if (mo49367R == null) {
                return;
            }
            C8009j.a aVar = new C8009j.a(mo49367R.getContext());
            aVar.m43159h(5);
            if (z11) {
                i11 = AbstractC8020f0.str_qrcode_confirm_make_video_call;
            } else {
                i11 = AbstractC8020f0.str_qrcode_confirm_make_audio_call;
            }
            String string = mo49367R.getString(i11);
            if (string == null) {
                return;
            }
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            aVar.m43162k(format);
            aVar.m43165n(mo49367R.getString(AbstractC8020f0.str_oacall_confirm_cancel), new InterfaceC17463d.d() { // from class: ly.g
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    AbstractC22687v.m117328e0(AbstractC22687v.this, interfaceC17463d, i12);
                }
            });
            aVar.m43170s(mo49367R.getString(AbstractC8020f0.str_oacall_confirm_accept), new InterfaceC17463d.d() { // from class: ly.h
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    AbstractC22687v.m117329f0(AbstractC22687v.this, jSONObject, interfaceC17463d, i12);
                }
            });
            aVar.m43167p(new InterfaceC17463d.c() { // from class: ly.i
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    AbstractC22687v.m117330g0(AbstractC22687v.this, interfaceC17463d);
                }
            });
            C8009j m43152a = aVar.m43152a();
            AbstractC19074t.m100207e(m43152a, "create(...)");
            m43152a.mo13822K();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m117328e0(AbstractC22687v abstractC22687v, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        abstractC22687v.mo49370a(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m117329f0(AbstractC22687v abstractC22687v, JSONObject jSONObject, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        AbstractC19074t.m100208f(jSONObject, "$item");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        abstractC22687v.mo49385q(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m117330g0(AbstractC22687v abstractC22687v, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        abstractC22687v.mo49370a(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m117331i0(AbstractC22687v abstractC22687v, String str) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        AbstractC19074t.m100208f(str, "$text");
        try {
            InterfaceC27218a mo49367R = abstractC22687v.mo49367R();
            if (mo49367R == null) {
                abstractC22687v.mo117300s(-1);
                return;
            }
            BaseZaloView mo49369U = abstractC22687v.mo49369U();
            if (mo49369U == null) {
                abstractC22687v.mo117300s(-1);
                return;
            }
            C8010k.a aVar = new C8010k.a(mo49367R.getContext());
            aVar.m43047f(AbstractC8020f0.str_copy);
            aVar.m43048g(AbstractC8020f0.qrcode_notice);
            aVar.m43046e(str);
            aVar.m43044c(new c(str, abstractC22687v));
            QRCodeResultViewDialog m43042a = aVar.m43042a();
            abstractC22687v.f111154b = m43042a;
            if (m43042a != null) {
                m43042a.mo83093TK(mo49369U.m92649TI());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m117332j0(AbstractC22687v abstractC22687v, String str, String str2) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        AbstractC19074t.m100208f(str, "$link");
        AbstractC19074t.m100208f(str2, "$message");
        try {
            InterfaceC27218a mo49367R = abstractC22687v.mo49367R();
            if (mo49367R == null) {
                abstractC22687v.mo117300s(-1);
                return;
            }
            BaseZaloView mo49369U = abstractC22687v.mo49369U();
            if (mo49369U == null) {
                abstractC22687v.mo117300s(-1);
                return;
            }
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.qrcode_link_invalid_do_open);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{str}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            boolean isEmpty = TextUtils.isEmpty(str2);
            if (isEmpty) {
                str2 = format;
            }
            boolean z11 = !isEmpty;
            C8010k.a aVar = new C8010k.a(mo49367R.getContext());
            if (!z11) {
                if (AbstractC0924m0.m3625Z8()) {
                    aVar.m43047f(AbstractC8020f0.str_yes);
                    aVar.m43045d(AbstractC8020f0.str_no);
                } else {
                    abstractC22687v.mo117300s(0);
                    try {
                        abstractC22687v.mo49386u(ZaloWebView.class, ZaloWebView.Companion.m87179u(str), -1);
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return;
                    }
                }
            } else {
                aVar.m43045d(AbstractC8020f0.str_cancel);
            }
            aVar.m43048g(AbstractC8020f0.qrcode_notice);
            aVar.m43046e(str2);
            aVar.m43044c(new d(str));
            QRCodeResultViewDialog m43042a = aVar.m43042a();
            abstractC22687v.f111154b = m43042a;
            if (m43042a != null) {
                m43042a.mo43041MK(false);
            }
            QRCodeResultViewDialog qRCodeResultViewDialog = abstractC22687v.f111154b;
            if (qRCodeResultViewDialog != null) {
                qRCodeResultViewDialog.mo83093TK(mo49369U.m92649TI());
            }
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static final void m117333k0(AbstractC22687v abstractC22687v, C20096c c20096c) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        AbstractC19074t.m100208f(c20096c, "$errMsg");
        try {
            InterfaceC27218a mo49367R = abstractC22687v.mo49367R();
            if (mo49367R == null) {
                abstractC22687v.mo117300s(-1);
                return;
            }
            BaseZaloView mo49369U = abstractC22687v.mo49369U();
            if (mo49369U == null) {
                abstractC22687v.mo117300s(-1);
                return;
            }
            C8010k.a aVar = new C8010k.a(mo49367R.getContext());
            aVar.m43045d(AbstractC8020f0.str_close);
            aVar.m43048g(AbstractC8020f0.qrcode_notice);
            aVar.m43046e(c20096c.m104492d());
            aVar.m43044c(new e());
            QRCodeResultViewDialog m43042a = aVar.m43042a();
            abstractC22687v.f111154b = m43042a;
            if (m43042a != null) {
                m43042a.mo43041MK(false);
            }
            QRCodeResultViewDialog qRCodeResultViewDialog = abstractC22687v.f111154b;
            if (qRCodeResultViewDialog != null) {
                qRCodeResultViewDialog.mo83093TK(mo49369U.m92649TI());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m117334m0(final AbstractC22687v abstractC22687v) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        try {
            InterfaceC27218a mo49367R = abstractC22687v.mo49367R();
            if (mo49367R == null) {
                return;
            }
            if (abstractC22687v.mo49369U() != null) {
                BaseZaloView mo49369U = abstractC22687v.mo49369U();
                if (mo49369U != null) {
                    mo49369U.mo78950cq(mo49367R.getString(AbstractC8020f0.loading));
                    return;
                }
                return;
            }
            if (abstractC22687v.f111153a == null) {
                ProgressDialogView progressDialogView = new ProgressDialogView();
                abstractC22687v.f111153a = progressDialogView;
                progressDialogView.m83097WK(mo49367R.getString(AbstractC8020f0.str_isProcessing));
                ProgressDialogView progressDialogView2 = abstractC22687v.f111153a;
                if (progressDialogView2 != null) {
                    progressDialogView2.m92597OK(new InterfaceC17463d.c() { // from class: ly.e
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                        /* renamed from: p7 */
                        public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                            AbstractC22687v.m117335n0(AbstractC22687v.this, interfaceC17463d);
                        }
                    });
                }
            }
            ProgressDialogView progressDialogView3 = abstractC22687v.f111153a;
            if (progressDialogView3 != null) {
                progressDialogView3.mo83093TK(mo49367R.mo35579p());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m117335n0(AbstractC22687v abstractC22687v, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        abstractC22687v.mo49370a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public static final void m117336o0(AbstractC22687v abstractC22687v, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, boolean z12, JSONObject jSONObject, String str7) {
        String string;
        AbstractC19074t.m100208f(abstractC22687v, "this$0");
        AbstractC19074t.m100208f(str7, "$pcName");
        try {
            if (abstractC22687v.mo49367R() == null) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                InterfaceC27218a mo49367R = abstractC22687v.mo49367R();
                if (mo49367R != null && (string = mo49367R.getString(AbstractC8020f0.str_loginpc_confirm)) != null) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    str = String.format(string, Arrays.copyOf(new Object[]{str7}, 1));
                    AbstractC19074t.m100207e(str, "format(...)");
                } else {
                    str = null;
                }
                if (str == null) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString("extra_pc_token", str2);
            bundle.putString("extra_pc_msg", str);
            bundle.putString("extra_pc_msg_html", str3);
            bundle.putString("extra_popup_actionbutton", str4);
            bundle.putString("extra_confirm_image", str5);
            bundle.putString("extra_deny_btn_text", str6);
            bundle.putBoolean("EXTRA_ENABLE_2FA", z11);
            AbstractC23775p0.m124197b("pc_login");
            if (z12 && jSONObject != null) {
                abstractC22687v.mo49380l0(jSONObject, bundle);
            } else {
                bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                abstractC22687v.mo49386u(PcLoginView.class, bundle, 1605);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            abstractC22687v.mo117300s(-1);
        }
    }

    /* renamed from: R */
    public abstract InterfaceC27218a mo49367R();

    /* renamed from: S */
    public final QRCodeResultViewDialog m117340S() {
        return this.f111154b;
    }

    /* renamed from: T */
    public int mo49368T() {
        return 33554432;
    }

    /* renamed from: U */
    public abstract BaseZaloView mo49369U();

    /* renamed from: Z */
    public final void m117341Z(QRCodeResultViewDialog qRCodeResultViewDialog) {
        this.f111154b = qRCodeResultViewDialog;
    }

    /* renamed from: b0 */
    public void m117342b0(final String str, final C20096c c20096c) {
        AbstractC19074t.m100208f(str, "link");
        AbstractC19074t.m100208f(c20096c, "errorMessage");
        AbstractC19444a.m101697e(new Runnable() { // from class: ly.f
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22687v.m117326c0(AbstractC22687v.this, str, c20096c);
            }
        });
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: c */
    public void mo117297c() {
        AbstractC19444a.m101697e(new Runnable() { // from class: ly.m
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22687v.m117319P(AbstractC22687v.this);
            }
        });
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: d */
    public void mo117298d() {
        AbstractC19444a.m101697e(new Runnable() { // from class: ly.t
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22687v.m117325a0(AbstractC22687v.this);
            }
        });
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: g */
    public void mo49374g(int i11) {
        ToastUtils.m89266n(i11, new Object[0]);
    }

    /* renamed from: h0 */
    public void m117343h0(final String str) {
        AbstractC19074t.m100208f(str, "text");
        AbstractC19444a.m101697e(new Runnable() { // from class: ly.u
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22687v.m117331i0(AbstractC22687v.this, str);
            }
        });
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: j */
    public boolean mo49377j(AbstractC23490m abstractC23490m) {
        AbstractC19074t.m100208f(abstractC23490m, "data");
        return false;
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: k */
    public void mo49378k(AbstractC23490m abstractC23490m, C20096c c20096c, int i11) {
        AbstractC19074t.m100208f(abstractC23490m, "result");
        AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        if (c20096c.m104491c() == 50001) {
            mo49374g(AbstractC8020f0.NETWORK_ERROR_MSG);
        }
        if (abstractC23490m instanceof AbstractC23490m.e) {
            m117343h0(abstractC23490m.m123294b());
        } else {
            m117342b0(abstractC23490m.m123294b(), c20096c);
        }
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: l */
    public void mo49379l(AbstractC23490m abstractC23490m, String str, String str2, String str3, int i11) {
        AbstractC19074t.m100208f(abstractC23490m, "result");
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "domain");
        AbstractC19074t.m100208f(str3, "thumbUrl");
        mo49382n(abstractC23490m, i11);
    }

    /* renamed from: l0 */
    public void mo49380l0(JSONObject jSONObject, Bundle bundle) {
        AbstractC19074t.m100208f(jSONObject, "zinstantSocketData");
        AbstractC19074t.m100208f(bundle, "extraBundle");
        InterfaceC27218a mo49367R = mo49367R();
        if (mo49367R != null && mo49367R.mo35572i0() && !mo49367R.isDestroyed() && !mo49367R.isFinishing()) {
            try {
                AbstractC28207v1.m141879I0(jSONObject, mo49367R, null, null, null, 1605, new v81(bundle), mo49368T());
            } catch (JSONException unused) {
                C23952g.m125345j("ZQRParseViewDelegate", "zinstantSocketData not valid-fallback old native confirm login PC");
                bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                mo49386u(PcLoginView.class, bundle, 1605);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZQRParseViewDelegate", e11);
            }
        }
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: m */
    public void mo49381m(final C20096c c20096c, AbstractC23490m abstractC23490m, int i11) {
        AbstractC19074t.m100208f(c20096c, "errMsg");
        AbstractC19074t.m100208f(abstractC23490m, "preData");
        AbstractC19444a.m101697e(new Runnable() { // from class: ly.n
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22687v.m117333k0(AbstractC22687v.this, c20096c);
            }
        });
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: n */
    public void mo49382n(AbstractC23490m abstractC23490m, int i11) {
        AbstractC19074t.m100208f(abstractC23490m, "result");
        if (abstractC23490m instanceof AbstractC23490m.e) {
            m117343h0(abstractC23490m.m123294b());
        } else {
            mo117302v(abstractC23490m.m123294b(), "");
        }
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: o */
    public void mo49383o(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final boolean z11, final boolean z12, final JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "pcName");
        AbstractC19444a.m101697e(new Runnable() { // from class: ly.o
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22687v.m117336o0(AbstractC22687v.this, str2, str3, str4, str5, str6, str7, z11, z12, jSONObject, str);
            }
        });
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: p */
    public void mo49384p(String str, int i11, String str2, C31877d c31877d) {
        AbstractC19074t.m100208f(str, "strAction");
        AbstractC19074t.m100208f(str2, "itemData");
        AbstractC28207v1.m141994i3(str, 0, mo49367R(), mo49369U(), str2, c31877d);
        if (AbstractC19074t.m100204b("action.mp.join.wifi", str)) {
            mo49370a(-2);
        }
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: r */
    public void mo117299r(final boolean z11, final JSONObject jSONObject, final String str) {
        AbstractC19074t.m100208f(jSONObject, "item");
        AbstractC19074t.m100208f(str, "name");
        AbstractC19444a.m101697e(new Runnable() { // from class: ly.r
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22687v.m117327d0(AbstractC22687v.this, z11, str, jSONObject);
            }
        });
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: s */
    public void mo117300s(final int i11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: ly.p
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22687v.m117320Q(AbstractC22687v.this, i11);
            }
        });
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: t */
    public void mo117301t() {
        AbstractC19444a.m101697e(new Runnable() { // from class: ly.q
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22687v.m117321V(AbstractC22687v.this);
            }
        });
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: v */
    public void mo117302v(final String str, final String str2) {
        AbstractC19074t.m100208f(str, "link");
        AbstractC19074t.m100208f(str2, "message");
        AbstractC19444a.m101697e(new Runnable() { // from class: ly.s
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22687v.m117332j0(AbstractC22687v.this, str, str2);
            }
        });
    }

    @Override // ly.InterfaceC22668c
    /* renamed from: w */
    public void mo117303w() {
        AbstractC19444a.m101697e(new Runnable() { // from class: ly.d
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22687v.m117334m0(AbstractC22687v.this);
            }
        });
    }
}
