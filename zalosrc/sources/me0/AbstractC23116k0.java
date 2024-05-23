package me0;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import java.util.Objects;
import me0.AbstractC23116k0;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23309i;
import p716zh.C31973j5;

/* renamed from: me0.k0 */
/* loaded from: classes4.dex */
public abstract class AbstractC23116k0 {

    /* renamed from: me0.k0$a */
    /* loaded from: classes4.dex */
    public static abstract class a {
        /* renamed from: a */
        public void mo62982a(InterfaceC17463d interfaceC17463d, int i11, Object... objArr) {
            interfaceC17463d.dismiss();
        }

        /* renamed from: b */
        public void mo56829b(InterfaceC17463d interfaceC17463d, int i11) {
            interfaceC17463d.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:3:0x0005, B:5:0x001a, B:7:0x0020, B:9:0x002a, B:11:0x0030, B:13:0x0048, B:21:0x005c, B:22:0x0061, B:24:0x0067, B:25:0x006c, B:27:0x00b4, B:28:0x00b9, B:30:0x00de, B:31:0x00e3, B:33:0x00f4, B:35:0x00e1, B:36:0x00b7, B:37:0x006a, B:38:0x005f, B:39:0x00fe, B:44:0x010b, B:45:0x0110, B:48:0x0118, B:49:0x011d, B:50:0x011b, B:51:0x0121, B:53:0x012b, B:54:0x0130, B:57:0x0154, B:60:0x017e, B:62:0x01ae, B:63:0x01b3, B:65:0x01c4, B:67:0x01b1, B:70:0x012e, B:71:0x010e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:3:0x0005, B:5:0x001a, B:7:0x0020, B:9:0x002a, B:11:0x0030, B:13:0x0048, B:21:0x005c, B:22:0x0061, B:24:0x0067, B:25:0x006c, B:27:0x00b4, B:28:0x00b9, B:30:0x00de, B:31:0x00e3, B:33:0x00f4, B:35:0x00e1, B:36:0x00b7, B:37:0x006a, B:38:0x005f, B:39:0x00fe, B:44:0x010b, B:45:0x0110, B:48:0x0118, B:49:0x011d, B:50:0x011b, B:51:0x0121, B:53:0x012b, B:54:0x0130, B:57:0x0154, B:60:0x017e, B:62:0x01ae, B:63:0x01b3, B:65:0x01c4, B:67:0x01b1, B:70:0x012e, B:71:0x010e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004f  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static KeyEventCallbackC17462c m118579g(Context context, C31973j5 c31973j5, final a aVar) {
        C8009j.a aVar2;
        View inflate;
        String str;
        int i11;
        View view;
        boolean z11;
        final int i12;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        try {
            aVar2 = new C8009j.a(context);
            inflate = LayoutInflater.from(context).inflate(AbstractC7409c0.leave_group_with_hint_dialog_layout, (ViewGroup) null);
            str = "";
            i11 = 0;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (c31973j5 != null && c31973j5.m153778p0()) {
            z11 = c31973j5.m153778p0();
            if (c31973j5.m153732O() > 2 && AbstractC23309i.m121219N1()) {
                view = LayoutInflater.from(context).inflate(AbstractC7409c0.owner_leave_group_dialog_layout, (ViewGroup) null);
                i12 = 2;
                if (c31973j5 == null) {
                    z12 = c31973j5.m153747Y();
                } else {
                    z12 = false;
                }
                if (i12 == 0) {
                    if (i12 != 2) {
                        return null;
                    }
                    if (z12) {
                        i17 = AbstractC8020f0.str_dialog_title_leave_community_owner_v2;
                    } else {
                        i17 = AbstractC8020f0.str_dialog_title_leave_group_owner_v2;
                    }
                    String m118743r0 = AbstractC23136l9.m118743r0(i17);
                    if (z12) {
                        i18 = AbstractC8020f0.str_dialog_msg_leave_community_owner_v2;
                    } else {
                        i18 = AbstractC8020f0.str_dialog_msg_leave_group_owner_v2;
                    }
                    SpannableString m119745i = AbstractC23244v8.m119745i(context, AbstractC23136l9.m118743r0(i18), C23212s8.m119611s(context, AbstractC21196a.TextColor2), 1);
                    View inflate2 = LayoutInflater.from(context).inflate(AbstractC7409c0.owner_leave_group_custom_title_sub_title_dialog, (ViewGroup) null);
                    RobotoTextView robotoTextView = (RobotoTextView) inflate2.findViewById(AbstractC6918a0.tv_custom_title);
                    RobotoTextView robotoTextView2 = (RobotoTextView) inflate2.findViewById(AbstractC6918a0.tv_custom_subtitle);
                    robotoTextView.setText(m118743r0);
                    robotoTextView2.setText(m119745i);
                    aVar2.m43158g(inflate2);
                    aVar2.m43150A(view, 0, 0, 0, 0);
                    final C8009j m43152a = aVar2.m43152a();
                    RobotoTextView robotoTextView3 = (RobotoTextView) view.findViewById(AbstractC6918a0.custom_btn);
                    if (z12) {
                        i19 = AbstractC8020f0.str_select_new_community_owner;
                    } else {
                        i19 = AbstractC8020f0.str_select_new_group_owner_v2;
                    }
                    robotoTextView3.setText(i19);
                    robotoTextView3.setOnClickListener(new View.OnClickListener() { // from class: me0.h0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            AbstractC23116k0.m118585m(i12, aVar, m43152a, view2);
                        }
                    });
                    ((RobotoTextView) view.findViewById(AbstractC6918a0.confirm_btn_no)).setOnClickListener(new View.OnClickListener() { // from class: me0.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            AbstractC23116k0.m118586n(AbstractC23116k0.a.this, m43152a, view2);
                        }
                    });
                    RobotoTextView robotoTextView4 = (RobotoTextView) view.findViewById(AbstractC6918a0.confirm_btn_yes);
                    if (z12) {
                        i21 = AbstractC8020f0.str_leave_community;
                    } else {
                        i21 = AbstractC8020f0.str_group_leave;
                    }
                    robotoTextView4.setText(i21);
                    robotoTextView4.setOnClickListener(new View.OnClickListener() { // from class: me0.j0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            AbstractC23116k0.m118587o(AbstractC23116k0.a.this, m43152a, view2);
                        }
                    });
                    if (robotoTextView3.getVisibility() == 8) {
                        robotoTextView4.setTextColor(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
                    }
                    return m43152a;
                }
                if (AbstractC23309i.m121626Y1() && !z11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12) {
                    i13 = AbstractC8020f0.str_leave_community_title_v2;
                } else {
                    i13 = AbstractC8020f0.str_leave_group_title_v2;
                }
                String m118743r02 = AbstractC23136l9.m118743r0(i13);
                if (!z13) {
                    if (z12) {
                        i16 = AbstractC8020f0.str_dialog_msg_leave_community_owner_2;
                    } else {
                        i16 = AbstractC8020f0.str_dialog_msg_leave_group_owner_2;
                    }
                    str = AbstractC23136l9.m118743r0(i16);
                }
                RobotoTextView robotoTextView5 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvDontAddAgain);
                if (z12) {
                    i14 = AbstractC8020f0.str_checkbox_dont_add_community_again;
                } else {
                    i14 = AbstractC8020f0.str_checkbox_dont_add_group_again_v3;
                }
                robotoTextView5.setText(i14);
                int m118742r = AbstractC23136l9.m118742r(8.0f);
                SpannableString m119745i2 = AbstractC23244v8.m119745i(context, str, C23212s8.m119611s(context, AbstractC21196a.TextColor1), 1);
                C8009j.a m43159h = aVar2.m43172u(m118743r02).m43173v(2).m43159h(3);
                if (z13) {
                    m119745i2 = null;
                }
                View view2 = view;
                m43159h.m43162k(m119745i2).m43150A(view, 0, m118742r, 0, 0);
                final C8009j m43152a2 = aVar2.m43152a();
                View findViewById = view2.findViewById(AbstractC6918a0.dontAddGroupAgainContainer);
                final CheckBox checkBox = (CheckBox) view2.findViewById(AbstractC6918a0.cbDontAddAgain);
                checkBox.setChecked(false);
                if (!z13) {
                    i11 = 8;
                }
                findViewById.setVisibility(i11);
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: me0.e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        AbstractC23116k0.m118582j(checkBox, view3);
                    }
                });
                RobotoTextView robotoTextView6 = (RobotoTextView) view2.findViewById(AbstractC6918a0.custom_btn);
                robotoTextView6.setVisibility(8);
                ((RobotoTextView) view2.findViewById(AbstractC6918a0.confirm_btn_no)).setOnClickListener(new View.OnClickListener() { // from class: me0.f0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        AbstractC23116k0.m118583k(AbstractC23116k0.a.this, m43152a2, view3);
                    }
                });
                RobotoTextView robotoTextView7 = (RobotoTextView) view2.findViewById(AbstractC6918a0.confirm_btn_yes);
                if (z12) {
                    i15 = AbstractC8020f0.str_leave_community;
                } else {
                    i15 = AbstractC8020f0.str_group_leave;
                }
                robotoTextView7.setText(i15);
                robotoTextView7.setOnClickListener(new View.OnClickListener() { // from class: me0.g0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        AbstractC23116k0.m118584l(AbstractC23116k0.a.this, m43152a2, checkBox, view3);
                    }
                });
                if (robotoTextView6.getVisibility() == 8) {
                    robotoTextView7.setTextColor(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
                }
                return m43152a2;
            }
            view = inflate;
        } else {
            view = inflate;
            z11 = false;
        }
        i12 = 0;
        if (c31973j5 == null) {
        }
        if (i12 == 0) {
        }
    }

    /* renamed from: h */
    public static KeyEventCallbackC17462c m118580h(Context context, boolean z11, final a aVar) {
        String[] strArr;
        try {
            C8009j.a aVar2 = new C8009j.a(context);
            View inflate = LayoutInflater.from(context).inflate(AbstractC7409c0.custom_title_sub_title_dialog, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tvTitle);
            TextView textView2 = (TextView) inflate.findViewById(AbstractC6918a0.tvSubtitle);
            textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.mute_context_title));
            textView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_subtitle_mute_group_dialog));
            aVar2.m43158g(inflate);
            if (z11) {
                strArr = new String[]{m118581i(AbstractC8020f0.context_item_1_hour), m118581i(AbstractC8020f0.context_item_4_hours), m118581i(AbstractC8020f0.context_item_8_AM), m118581i(AbstractC8020f0.context_item_no_limit), m118581i(AbstractC8020f0.str_more_settings)};
            } else {
                strArr = new String[]{m118581i(AbstractC8020f0.context_item_1_hour), m118581i(AbstractC8020f0.context_item_4_hours), m118581i(AbstractC8020f0.context_item_8_AM), m118581i(AbstractC8020f0.context_item_no_limit)};
            }
            Objects.requireNonNull(aVar);
            aVar2.m43160i(strArr, new InterfaceC17463d.d() { // from class: me0.d0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    AbstractC23116k0.a.this.mo56829b(interfaceC17463d, i11);
                }
            });
            return aVar2.m43152a();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    static String m118581i(int i11) {
        return AbstractC23136l9.m118743r0(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m118582j(CheckBox checkBox, View view) {
        try {
            checkBox.setChecked(!checkBox.isChecked());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m118583k(a aVar, KeyEventCallbackC17462c keyEventCallbackC17462c, View view) {
        aVar.mo62982a(keyEventCallbackC17462c, -2, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m118584l(a aVar, KeyEventCallbackC17462c keyEventCallbackC17462c, CheckBox checkBox, View view) {
        aVar.mo62982a(keyEventCallbackC17462c, -1, Boolean.valueOf(checkBox.isChecked()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m118585m(int i11, a aVar, KeyEventCallbackC17462c keyEventCallbackC17462c, View view) {
        if (i11 == 2) {
            aVar.mo62982a(keyEventCallbackC17462c, 2, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m118586n(a aVar, KeyEventCallbackC17462c keyEventCallbackC17462c, View view) {
        aVar.mo62982a(keyEventCallbackC17462c, -2, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ void m118587o(a aVar, KeyEventCallbackC17462c keyEventCallbackC17462c, View view) {
        aVar.mo62982a(keyEventCallbackC17462c, -1, Boolean.FALSE);
    }
}
