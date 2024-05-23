package com.zing.zalo.dialog;

import am.AbstractC0906d0;
import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C7998b;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import me0.AbstractC23034c6;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import p304ks.AbstractC21935u;
import p361nb.AbstractC23647d;
import p716zh.C31901e8;

/* renamed from: com.zing.zalo.dialog.b */
/* loaded from: classes3.dex */
public class C7998b {

    /* renamed from: a */
    Context f43714a;

    /* renamed from: b */
    ContactProfile f43715b;

    /* renamed from: c */
    CheckBox f43716c;

    /* renamed from: d */
    a f43717d;

    /* renamed from: com.zing.zalo.dialog.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: ky */
        void mo43064ky(ContactProfile contactProfile, boolean z11);
    }

    public C7998b(Context context, ContactProfile contactProfile, a aVar) {
        this.f43714a = context;
        this.f43715b = contactProfile;
        this.f43717d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m43060e(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23647d.m123897g("3000219");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m43061f(InterfaceC17463d interfaceC17463d, int i11) {
        boolean z11;
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        a aVar = this.f43717d;
        if (aVar != null) {
            ContactProfile contactProfile = this.f43715b;
            CheckBox checkBox = this.f43716c;
            if (checkBox != null && checkBox.isChecked()) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar.mo43064ky(contactProfile, z11);
        }
        AbstractC23647d.m123897g("3000218");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m43062g(View view) {
        CheckBox checkBox = this.f43716c;
        if (checkBox != null) {
            checkBox.performClick();
        }
    }

    /* renamed from: d */
    public C8009j m43063d() {
        Spanned fromHtml;
        String m40383Q = this.f43715b.m40383Q(true, false);
        if (!TextUtils.isEmpty(m40383Q) && m40383Q.length() > 20) {
            m40383Q = m40383Q.substring(0, 20).concat("…");
        }
        String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_phonebook_friend_dialog_desc), m40383Q);
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(format, 63);
        } else {
            fromHtml = Html.fromHtml(format);
        }
        C8009j.a aVar = new C8009j.a(this.f43714a);
        aVar.m43159h(1).m43162k(fromHtml).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.d() { // from class: bn.v
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C7998b.m43060e(interfaceC17463d, i11);
            }
        }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: bn.w
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C7998b.this.m43061f(interfaceC17463d, i11);
            }
        });
        this.f43716c = null;
        if (AbstractC21935u.m114554u(this.f43715b.f42434r) || AbstractC23063f2.m118360l(this.f43715b.f42434r) || AbstractC23063f2.m118359k(this.f43715b.f42434r)) {
            try {
                if (!TextUtils.isEmpty(this.f43715b.f42455y) && AbstractC23034c6.m118167n(this.f43714a, AbstractC23034c6.f112032i) == 0) {
                    View inflate = LayoutInflater.from(this.f43714a).inflate(AbstractC7409c0.checkbox_remove_zalo_friend_view, (ViewGroup) null);
                    this.f43716c = (CheckBox) inflate.findViewById(AbstractC6918a0.cbRemoveContact);
                    C31901e8 m2800f = AbstractC0906d0.m2800f(this.f43714a, this.f43715b.f42455y);
                    if (m2800f != null && !TextUtils.isEmpty(m2800f.m153297j())) {
                        inflate.setOnClickListener(new View.OnClickListener() { // from class: bn.x
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C7998b.this.m43062g(view);
                            }
                        });
                        aVar.m43177z(inflate);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return aVar.m43152a();
    }
}
