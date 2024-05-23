package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import am.C0943w;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.concurrent.atomic.AtomicInteger;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p716zh.C31973j5;

/* loaded from: classes6.dex */
public class CustomGroupLinkView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: P0 */
    RobotoTextView f73044P0;

    /* renamed from: Q0 */
    CustomEditText f73045Q0;

    /* renamed from: R0 */
    RobotoTextView f73046R0;

    /* renamed from: S0 */
    RobotoTextView f73047S0;

    /* renamed from: T0 */
    String f73048T0;

    /* renamed from: U0 */
    C31973j5 f73049U0;

    /* renamed from: V0 */
    String f73050V0;

    /* renamed from: Z0 */
    String f73054Z0;

    /* renamed from: W0 */
    boolean f73051W0 = false;

    /* renamed from: X0 */
    boolean f73052X0 = false;

    /* renamed from: Y0 */
    boolean f73053Y0 = false;

    /* renamed from: a1 */
    String f73055a1 = "zaloapp.com/g/";

    /* renamed from: b1 */
    int f73056b1 = 32;

    /* renamed from: c1 */
    private final TextWatcher f73057c1 = new C14201a();

    /* renamed from: d1 */
    Handler f73058d1 = new Handler(Looper.getMainLooper(), new C14202b());

    /* renamed from: com.zing.zalo.ui.zviews.CustomGroupLinkView$a */
    /* loaded from: classes6.dex */
    class C14201a extends AbstractC18391a {
        C14201a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            CustomEditText customEditText = CustomGroupLinkView.this.f73045Q0;
            if (customEditText != null && customEditText.getText() != null) {
                String trim = CustomGroupLinkView.this.f73045Q0.getText().toString().trim();
                CustomGroupLinkView.this.f73058d1.removeMessages(1);
                CustomGroupLinkView customGroupLinkView = CustomGroupLinkView.this;
                customGroupLinkView.f73054Z0 = "";
                customGroupLinkView.f73046R0.setText("");
                CustomGroupLinkView.this.f73053Y0 = false;
                if (TextUtils.isEmpty(trim)) {
                    CustomGroupLinkView.this.f73051W0 = false;
                } else {
                    Handler handler = CustomGroupLinkView.this.f73058d1;
                    handler.sendMessageDelayed(handler.obtainMessage(1, trim), 300L);
                }
                CustomGroupLinkView.this.m79190jM();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.CustomGroupLinkView$b */
    /* loaded from: classes6.dex */
    class C14202b implements Handler.Callback {
        C14202b() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                switch (message.what) {
                    case 1:
                        CustomGroupLinkView.this.m79188hM((String) message.obj);
                        break;
                    case 2:
                        CustomGroupLinkView customGroupLinkView = CustomGroupLinkView.this;
                        customGroupLinkView.f73053Y0 = false;
                        customGroupLinkView.f73054Z0 = "Checking link...";
                        customGroupLinkView.f73046R0.setText("Checking link...");
                        CustomGroupLinkView customGroupLinkView2 = CustomGroupLinkView.this;
                        customGroupLinkView2.f73046R0.setTextColor(customGroupLinkView2.m92651WI().getColor(AbstractC16801x.cMtxt2));
                        CustomGroupLinkView.this.m79190jM();
                        break;
                    case 3:
                        CustomGroupLinkView customGroupLinkView3 = CustomGroupLinkView.this;
                        customGroupLinkView3.f73053Y0 = false;
                        customGroupLinkView3.f73054Z0 = "";
                        Object obj = message.obj;
                        if (obj != null) {
                            customGroupLinkView3.f73054Z0 = (String) obj;
                        }
                        customGroupLinkView3.f73046R0.setText(customGroupLinkView3.f73054Z0);
                        CustomGroupLinkView customGroupLinkView4 = CustomGroupLinkView.this;
                        customGroupLinkView4.f73046R0.setTextColor(customGroupLinkView4.m92651WI().getColor(AbstractC16801x.red_color1));
                        CustomGroupLinkView.this.m79190jM();
                        break;
                    case 4:
                        CustomGroupLinkView customGroupLinkView5 = CustomGroupLinkView.this;
                        customGroupLinkView5.f73053Y0 = true;
                        customGroupLinkView5.f73054Z0 = "";
                        Object obj2 = message.obj;
                        if (obj2 != null) {
                            customGroupLinkView5.f73054Z0 = (String) obj2;
                        }
                        customGroupLinkView5.f73046R0.setText(customGroupLinkView5.f73054Z0);
                        CustomGroupLinkView customGroupLinkView6 = CustomGroupLinkView.this;
                        customGroupLinkView6.f73046R0.setTextColor(customGroupLinkView6.m92651WI().getColor(AbstractC16801x.cAccent1));
                        CustomGroupLinkView.this.m79190jM();
                        break;
                    case 5:
                        if (CustomGroupLinkView.this.m92672lJ()) {
                            CustomGroupLinkView.this.mo50035CK(-1, null);
                            CustomGroupLinkView.this.finish();
                            break;
                        }
                        break;
                    case 6:
                        AbstractC2379w.m12432f(CustomGroupLinkView.this.f73045Q0);
                        break;
                    case 7:
                        CustomGroupLinkView.this.m79191kM();
                        break;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.CustomGroupLinkView$c */
    /* loaded from: classes6.dex */
    public class C14203c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f73061a;

        C14203c(String str) {
            this.f73061a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            CustomGroupLinkView customGroupLinkView = CustomGroupLinkView.this;
            customGroupLinkView.f73051W0 = false;
            Handler handler = customGroupLinkView.f73058d1;
            handler.sendMessage(handler.obtainMessage(3, customGroupLinkView.m92651WI().getString(AbstractC8020f0.error_general)));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[Catch: all -> 0x001b, Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:4:0x0002, B:7:0x000e, B:8:0x0020, B:10:0x0028, B:12:0x0039, B:16:0x0046, B:18:0x004e, B:19:0x005b), top: B:3:0x0002, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[Catch: all -> 0x001b, Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:4:0x0002, B:7:0x000e, B:8:0x0020, B:10:0x0028, B:12:0x0039, B:16:0x0046, B:18:0x004e, B:19:0x005b), top: B:3:0x0002, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: all -> 0x001b, Exception -> 0x001d, TRY_LEAVE, TryCatch #0 {Exception -> 0x001d, blocks: (B:4:0x0002, B:7:0x000e, B:8:0x0020, B:10:0x0028, B:12:0x0039, B:16:0x0046, B:18:0x004e, B:19:0x005b), top: B:3:0x0002, outer: #1 }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            String str;
            boolean z11;
            try {
                try {
                    String str2 = "";
                    if (CustomGroupLinkView.this.f73045Q0.getText() == null) {
                        str = "";
                    } else {
                        str = CustomGroupLinkView.this.f73045Q0.getText().toString();
                    }
                    if (TextUtils.equals(this.f73061a, str)) {
                        JSONObject optJSONObject = new JSONObject(obj.toString()).optJSONObject("data");
                        if (optJSONObject != null) {
                            z11 = true;
                            if (optJSONObject.optInt("isValid", 0) == 1) {
                                if (optJSONObject != null) {
                                    str2 = optJSONObject.optString("desc", "");
                                }
                                if (!z11) {
                                    Handler handler = CustomGroupLinkView.this.f73058d1;
                                    handler.sendMessage(handler.obtainMessage(4, str2));
                                } else {
                                    Handler handler2 = CustomGroupLinkView.this.f73058d1;
                                    handler2.sendMessage(handler2.obtainMessage(3, str2));
                                }
                            }
                        }
                        z11 = false;
                        if (optJSONObject != null) {
                        }
                        if (!z11) {
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    CustomGroupLinkView customGroupLinkView = CustomGroupLinkView.this;
                    Handler handler3 = customGroupLinkView.f73058d1;
                    handler3.sendMessage(handler3.obtainMessage(3, customGroupLinkView.m92651WI().getString(AbstractC8020f0.error_general)));
                }
                CustomGroupLinkView.this.f73051W0 = false;
            } catch (Throwable th2) {
                CustomGroupLinkView.this.f73051W0 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.CustomGroupLinkView$d */
    /* loaded from: classes6.dex */
    public class C14204d implements InterfaceC20094a {
        C14204d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                CustomGroupLinkView customGroupLinkView = CustomGroupLinkView.this;
                customGroupLinkView.f73052X0 = false;
                customGroupLinkView.f73058d1.removeMessages(7);
                CustomGroupLinkView.this.f73058d1.sendEmptyMessage(7);
                CustomGroupLinkView customGroupLinkView2 = CustomGroupLinkView.this;
                Handler handler = customGroupLinkView2.f73058d1;
                handler.sendMessage(handler.obtainMessage(3, customGroupLinkView2.m92651WI().getString(AbstractC8020f0.error_general)));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject optJSONObject = new JSONObject(obj.toString()).optJSONObject("data");
                    if (optJSONObject != null) {
                        if (optJSONObject.optInt("isValid") == 1) {
                            String optString = optJSONObject.optString("link");
                            C31973j5 m4472f = C0943w.m4462l().m4472f(CustomGroupLinkView.this.f73048T0);
                            if (m4472f != null) {
                                m4472f.m153714E0(optString);
                                C0943w.m4462l().m4483w(m4472f);
                            }
                            CustomGroupLinkView.this.f73058d1.sendEmptyMessage(5);
                        } else {
                            Handler handler = CustomGroupLinkView.this.f73058d1;
                            handler.sendMessage(handler.obtainMessage(3, optJSONObject.optString("desc")));
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                CustomGroupLinkView customGroupLinkView = CustomGroupLinkView.this;
                customGroupLinkView.f73052X0 = false;
                customGroupLinkView.f73058d1.removeMessages(7);
                CustomGroupLinkView.this.f73058d1.sendEmptyMessage(7);
            } catch (Throwable th2) {
                CustomGroupLinkView customGroupLinkView2 = CustomGroupLinkView.this;
                customGroupLinkView2.f73052X0 = false;
                customGroupLinkView2.f73058d1.removeMessages(7);
                CustomGroupLinkView.this.f73058d1.sendEmptyMessage(7);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m79187lM(View view) {
        Editable text = this.f73045Q0.getText();
        if (this.f73053Y0 && text != null) {
            m79189iM(text.toString());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        int indexOf;
        super.mo37111CJ(bundle);
        AtomicInteger atomicInteger = AbstractC23304d.f113357a;
        this.f73055a1 = "zaloapp.com/g/";
        this.f73056b1 = 32;
        String str = "";
        if (m92642L3() != null) {
            str = m92642L3().getString("extra_group_id", "");
        }
        this.f73048T0 = str;
        if (TextUtils.isEmpty(str)) {
            ToastUtils.m89266n(AbstractC8020f0.str_group_unknown_error, new Object[0]);
            finish();
            return;
        }
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f73048T0);
        this.f73049U0 = m4472f;
        if (m4472f == null) {
            ToastUtils.m89266n(AbstractC8020f0.str_group_unknown_error, new Object[0]);
            finish();
        } else if (!TextUtils.isEmpty(m4472f.m153773n()) && !TextUtils.isEmpty(this.f73055a1) && this.f73049U0.m153773n().contains(this.f73055a1) && (indexOf = this.f73049U0.m153773n().indexOf(this.f73055a1) + this.f73055a1.length()) <= this.f73049U0.m153773n().length()) {
            this.f73050V0 = this.f73049U0.m153773n().substring(indexOf);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.custom_group_link_view, viewGroup, false);
        this.f73044P0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_custom_group_link_prefix);
        CustomEditText customEditText = (CustomEditText) inflate.findViewById(AbstractC6918a0.edt_custom_group_link_input);
        this.f73045Q0 = customEditText;
        customEditText.addTextChangedListener(this.f73057c1);
        this.f73046R0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_custom_group_link_check_status);
        this.f73047S0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_custom_group_link_rule_desc);
        this.f73045Q0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f73056b1)});
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        if (m87077NK() != null) {
            m87077NK().setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ma
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomGroupLinkView.this.m79187lM(view);
                }
            });
        }
        m79190jM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        Editable text = this.f73045Q0.getText();
        if (text != null) {
            bundle.putString("STR_EXTRA_SAVED_INPUT_LINK", text.toString());
        }
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        this.f73044P0.setText(this.f73055a1);
        if (bundle != null) {
            this.f73045Q0.setText(bundle.getString("STR_EXTRA_SAVED_INPUT_LINK"));
        } else {
            this.f73045Q0.setText(this.f73050V0);
        }
        Editable text = this.f73045Q0.getText();
        if (text != null) {
            this.f73045Q0.setSelection(text.length());
        }
        AtomicInteger atomicInteger = AbstractC23304d.f113357a;
        this.f73047S0.setText("");
        this.f73058d1.sendEmptyMessageDelayed(6, 200L);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        super.finish();
        AbstractC2379w.m12430d(this.f73045Q0);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CustomGroupLinkView";
    }

    /* renamed from: hM */
    void m79188hM(String str) {
        if (this.f73051W0) {
            return;
        }
        if (TextUtils.equals(this.f73050V0, str)) {
            this.f73053Y0 = false;
            return;
        }
        this.f73051W0 = true;
        this.f73058d1.sendEmptyMessage(2);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14203c(str));
        c0766k.mo1469K7(str);
    }

    /* renamed from: iM */
    void m79189iM(String str) {
        if (this.f73052X0) {
            return;
        }
        this.f73052X0 = true;
        this.f73058d1.removeMessages(7);
        m79191kM();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14204d());
        c0766k.mo1726r6(this.f73048T0, str);
    }

    /* renamed from: jM */
    void m79190jM() {
        if (m87077NK() != null && m87077NK().getTrailingButton() != null) {
            m87077NK().getTrailingButton().setEnabled(this.f73053Y0);
        }
    }

    /* renamed from: kM */
    void m79191kM() {
        CustomEditText customEditText = this.f73045Q0;
        if (customEditText != null) {
            customEditText.setEnabled(!this.f73052X0);
        }
    }
}
