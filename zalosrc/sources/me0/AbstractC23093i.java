package me0;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SimpleAdapter;
import ao.InterfaceC2267i;
import bn.C2913t1;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import java.util.ArrayList;
import java.util.HashMap;
import me0.AbstractC23093i;
import p348mi.AbstractC23309i;
import v20.C27473a;

/* renamed from: me0.i */
/* loaded from: classes4.dex */
public abstract class AbstractC23093i {

    /* renamed from: a */
    private static KeyEventCallbackC17462c f112160a;

    /* renamed from: me0.i$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo87380a(int i11);
    }

    /* renamed from: A */
    public static /* synthetic */ void m118444A(CheckBox checkBox, View view) {
        if (checkBox != null) {
            try {
                checkBox.performClick();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: B */
    public static /* synthetic */ void m118445B(SimpleAdapter simpleAdapter, a aVar, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        aVar.mo87380a(((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue());
    }

    /* renamed from: C */
    public static /* synthetic */ void m118446C(C27473a c27473a, Context context, String str, InterfaceC2267i interfaceC2267i, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            int m140529a = c27473a.m140529a(i11);
            if (m140529a == -1) {
                return;
            }
            if (m140529a == 1) {
                ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(context, str, new SensitiveData("clipboard_copy_text_from_menu", "ui_component"));
            } else if (m140529a == 2 && interfaceC2267i != null) {
                interfaceC2267i.mo11994a();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m118447D(C27473a c27473a, Context context, String str, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            int m140529a = c27473a.m140529a(i11);
            if (m140529a != -1 && m140529a == 1) {
                ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(context, str, new SensitiveData("clipboard_copy_text_from_menu", "ui_component"));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static void m118454g(ZaloActivity zaloActivity) {
        Context m92866j;
        KeyEventCallbackC17462c keyEventCallbackC17462c = f112160a;
        if (keyEventCallbackC17462c != null && zaloActivity != null && (m92866j = keyEventCallbackC17462c.m92866j()) != null && m92866j.equals(zaloActivity)) {
            if (f112160a.m92868m()) {
                f112160a.dismiss();
            }
            f112160a = null;
        }
    }

    /* renamed from: h */
    public static KeyEventCallbackC17462c m118455h(Context context, String str, InterfaceC17463d.d dVar) {
        return m118456i(context, context.getString(AbstractC8020f0.str_titleDlg2), str, context.getString(AbstractC8020f0.str_yes), context.getString(AbstractC8020f0.str_no), dVar, new InterfaceC17463d.b());
    }

    /* renamed from: i */
    public static KeyEventCallbackC17462c m118456i(Context context, String str, String str2, String str3, String str4, InterfaceC17463d.d dVar, InterfaceC17463d.d dVar2) {
        C8009j.a aVar = new C8009j.a(context);
        aVar.m43172u(str).m43162k(str2).m43165n(str4, dVar2).m43170s(str3, dVar);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(true);
        return m43152a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: me0.c.<init>(android.widget.CheckBox, com.zing.zalo.zview.dialog.d$d):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: j */
    public static com.zing.zalo.zview.dialog.KeyEventCallbackC17462c m118457j(android.content.Context r9, com.zing.zalo.zview.dialog.InterfaceC17463d.d r10) {
        /*
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r9)
            int r1 = com.zing.zalo.AbstractC7409c0.photo_hd_caution_not_show_again_view
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            int r1 = com.zing.zalo.AbstractC6918a0.cbNotShowAgain
            android.view.View r1 = r0.findViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r2 = 1103101952(0x41c00000, float:24.0)
            int r7 = me0.AbstractC23136l9.m118712h(r9, r2)
            r2 = 1098907648(0x41800000, float:16.0)
            int r6 = me0.AbstractC23136l9.m118712h(r9, r2)
            com.zing.zalo.dialog.j$a r2 = new com.zing.zalo.dialog.j$a
            r2.<init>(r9)
            int r3 = com.zing.zalo.AbstractC8020f0.str_inform_dialog_title_general
            java.lang.String r3 = r9.getString(r3)
            com.zing.zalo.dialog.j$a r3 = r2.m43172u(r3)
            int r4 = com.zing.zalo.AbstractC8020f0.str_enable_network_gps
            com.zing.zalo.dialog.j$a r3 = r3.m43161j(r4)
            r8 = 0
            r4 = r0
            r5 = r7
            com.zing.zalo.dialog.j$a r3 = r3.m43150A(r4, r5, r6, r7, r8)
            int r4 = com.zing.zalo.AbstractC8020f0.str_gps_network_setting
            java.lang.String r9 = r9.getString(r4)
            me0.c r4 = new me0.c
            r4.<init>()
            com.zing.zalo.dialog.j$a r9 = r3.m43170s(r9, r4)
            int r10 = com.zing.zalo.AbstractC8020f0.str_gps_network_setting_skip
            me0.d r3 = new me0.d
            r3.<init>()
            r9.m43164m(r10, r3)
            int r9 = com.zing.zalo.AbstractC6918a0.tvNotShowAgain
            android.view.View r9 = r0.findViewById(r9)
            if (r9 == 0) goto L64
            me0.e r10 = new me0.e
            r10.<init>()
            r9.setOnClickListener(r10)
        L64:
            com.zing.zalo.dialog.j r9 = r2.m43152a()
            r10 = 1
            r9.m92873y(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me0.AbstractC23093i.m118457j(android.content.Context, com.zing.zalo.zview.dialog.d$d):com.zing.zalo.zview.dialog.c");
    }

    /* renamed from: k */
    public static KeyEventCallbackC17462c m118458k(Context context, String str, InterfaceC17463d.d dVar) {
        C8009j c8009j = null;
        try {
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_block_user_see_timeline_feed_confirm_desc, str);
            C8009j.a aVar = new C8009j.a(context);
            aVar.m43172u("").m43159h(4).m43162k(m118746s0).m43165n(context.getString(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(context.getString(AbstractC8020f0.str_feed_item_option_item_block_confirm), dVar);
            c8009j = aVar.m43152a();
            c8009j.m92873y(false);
            return c8009j;
        } catch (Exception e11) {
            e11.printStackTrace();
            return c8009j;
        }
    }

    /* renamed from: l */
    public static KeyEventCallbackC17462c m118459l(Context context, InterfaceC17463d.d dVar, InterfaceC17463d.d dVar2, InterfaceC17463d.c cVar) {
        C8009j.a aVar = new C8009j.a(context);
        aVar.m43172u(context.getString(AbstractC8020f0.str_cancel_compress_video_dialog_title)).m43159h(1).m43162k(context.getString(AbstractC8020f0.str_cancel_compress_video_dialog_msg)).m43165n(context.getString(AbstractC8020f0.str_cancel_compress_video_dialog_negative), dVar).m43170s(context.getString(AbstractC8020f0.str_cancel_compress_video_dialog_positive), dVar2);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(true);
        m43152a.m92854E(cVar);
        return m43152a;
    }

    /* renamed from: m */
    public static KeyEventCallbackC17462c m118460m(Context context, boolean z11, boolean z12, boolean z13, boolean z14, CharSequence charSequence, a aVar) {
        ArrayList arrayList = new ArrayList();
        if (z11) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_optionmenu_reply));
            hashMap.put("id", Integer.valueOf(AbstractC8020f0.str_tv_optionmenu_reply));
            arrayList.add(hashMap);
        }
        if (z12) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.copy));
            hashMap2.put("id", Integer.valueOf(AbstractC8020f0.copy));
            arrayList.add(hashMap2);
        }
        if (z13) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.delete_comment));
            hashMap3.put("id", Integer.valueOf(AbstractC8020f0.delete_comment));
            arrayList.add(hashMap3);
        }
        if (z14) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_reportabuse));
            hashMap4.put("id", Integer.valueOf(AbstractC8020f0.str_reportabuse));
            arrayList.add(hashMap4);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(context, arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j.a aVar2 = new C8009j.a(context);
        aVar2.m43172u(charSequence);
        aVar2.m43173v(1);
        aVar2.m43155d(true);
        aVar2.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: me0.g

            /* renamed from: p */
            public final /* synthetic */ SimpleAdapter f112112p;

            /* renamed from: q */
            public final /* synthetic */ AbstractC23093i.a f112113q;

            public /* synthetic */ C23071g(SimpleAdapter simpleAdapter2, AbstractC23093i.a aVar3) {
                r1 = simpleAdapter2;
                r2 = aVar3;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                AbstractC23093i.m118445B(r1, r2, interfaceC17463d, i11);
            }
        });
        C8009j m43152a = aVar2.m43152a();
        f112160a = m43152a;
        return m43152a;
    }

    /* renamed from: n */
    public static KeyEventCallbackC17462c m118461n(Context context, String str, InterfaceC2267i interfaceC2267i) {
        try {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C27473a.a(1, context.getString(AbstractC8020f0.copy)));
                    arrayList.add(new C27473a.a(2, context.getString(AbstractC8020f0.translate)));
                    C27473a c27473a = new C27473a(context);
                    c27473a.m140530b(arrayList);
                    C8009j.a aVar = new C8009j.a(context);
                    aVar.m43172u(str);
                    aVar.m43153b(c27473a, new InterfaceC17463d.d() { // from class: me0.h

                        /* renamed from: q */
                        public final /* synthetic */ Context f112137q;

                        /* renamed from: r */
                        public final /* synthetic */ String f112138r;

                        /* renamed from: s */
                        public final /* synthetic */ InterfaceC2267i f112139s;

                        public /* synthetic */ C23082h(Context context2, String str2, InterfaceC2267i interfaceC2267i2) {
                            r2 = context2;
                            r3 = str2;
                            r4 = interfaceC2267i2;
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                            AbstractC23093i.m118446C(C27473a.this, r2, r3, r4, interfaceC17463d, i11);
                        }
                    });
                    C8009j m43152a = aVar.m43152a();
                    f112160a = m43152a;
                    return m43152a;
                }
                throw new IllegalArgumentException("TextCopy is empty");
            }
            throw new IllegalArgumentException("context is null");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: o */
    public static KeyEventCallbackC17462c m118462o(Context context, String str) {
        try {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C27473a.a(1, context.getString(AbstractC8020f0.copy)));
                    C27473a c27473a = new C27473a(context);
                    c27473a.m140530b(arrayList);
                    C8009j.a aVar = new C8009j.a(context);
                    aVar.m43172u(str);
                    aVar.m43153b(c27473a, new InterfaceC17463d.d() { // from class: me0.f

                        /* renamed from: q */
                        public final /* synthetic */ Context f112073q;

                        /* renamed from: r */
                        public final /* synthetic */ String f112074r;

                        public /* synthetic */ C23060f(Context context2, String str2) {
                            r2 = context2;
                            r3 = str2;
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                            AbstractC23093i.m118447D(C27473a.this, r2, r3, interfaceC17463d, i11);
                        }
                    });
                    C8009j m43152a = aVar.m43152a();
                    f112160a = m43152a;
                    return m43152a;
                }
                throw new IllegalArgumentException("TextCopy is empty");
            }
            throw new IllegalArgumentException("context is null");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: p */
    public static KeyEventCallbackC17462c m118463p(Context context, InterfaceC17463d.d dVar) {
        C8009j.a aVar = new C8009j.a(context);
        aVar.m43159h(7).m43162k(context.getString(AbstractC8020f0.str_feed_group_delete_dialog_msg_v2)).m43165n(context.getString(AbstractC8020f0.cancel), new InterfaceC17463d.b()).m43170s(context.getString(AbstractC8020f0.delete), dVar);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        return m43152a;
    }

    /* renamed from: q */
    public static KeyEventCallbackC17462c m118464q(Context context, C2913t1.b bVar, String str, String str2, String str3) {
        try {
            return new C2913t1(context).m13865e(bVar).m13862b(str, str2, str3).m13861a();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: r */
    public static KeyEventCallbackC17462c m118465r(Context context, InterfaceC17463d.d dVar) {
        C8009j.a aVar = new C8009j.a(context);
        aVar.m43172u(context.getString(AbstractC8020f0.str_titleDlg2)).m43162k(context.getString(AbstractC8020f0.str_status_share_facebook_zm_save_hint)).m43170s(context.getString(AbstractC8020f0.f43842ok), dVar);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        m43152a.m92874z(false);
        return m43152a;
    }

    /* renamed from: s */
    public static KeyEventCallbackC17462c m118466s(Context context, InterfaceC17463d.d dVar) {
        C8009j.a aVar = new C8009j.a(context);
        aVar.m43172u(context.getString(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(context.getString(AbstractC8020f0.str_ask_to_use_usernearby)).m43165n(context.getString(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(context.getString(AbstractC8020f0.str_yes), dVar);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(true);
        return m43152a;
    }

    /* renamed from: t */
    public static KeyEventCallbackC17462c m118467t(Context context, InterfaceC17463d.d dVar) {
        C8009j.a aVar = new C8009j.a(context);
        aVar.m43159h(6).m43162k(context.getString(AbstractC8020f0.undo_msg_first_time_use)).m43170s(context.getString(AbstractC8020f0.str_close), dVar);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        return m43152a;
    }

    /* renamed from: u */
    public static KeyEventCallbackC17462c m118468u(Context context, String str, InterfaceC17463d.d dVar) {
        C8009j c8009j = null;
        try {
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_hide_user_feed_confirm_desc, str);
            C8009j.a aVar = new C8009j.a(context);
            aVar.m43172u("").m43159h(4).m43162k(m118746s0).m43165n(context.getString(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(context.getString(AbstractC8020f0.profile_hide_feed_user_confirm), dVar);
            c8009j = aVar.m43152a();
            c8009j.m92873y(false);
            return c8009j;
        } catch (Exception e11) {
            e11.printStackTrace();
            return c8009j;
        }
    }

    /* renamed from: v */
    public static KeyEventCallbackC17462c m118469v(Context context, InterfaceC17463d.d dVar, int i11) {
        C8009j.a aVar = new C8009j.a(context);
        aVar.m43172u(context.getString(AbstractC8020f0.str_titleDlg2)).m43162k(context.getString(i11)).m43165n(context.getString(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(context.getString(AbstractC8020f0.str_yes), dVar);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        return m43152a;
    }

    /* renamed from: w */
    public static KeyEventCallbackC17462c m118470w(Context context, InterfaceC17463d.d dVar, String str) {
        C8009j.a aVar = new C8009j.a(context);
        aVar.m43172u(context.getString(AbstractC8020f0.str_titleDlg2)).m43162k(str).m43165n(context.getString(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(context.getString(AbstractC8020f0.str_yes), dVar);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        return m43152a;
    }

    /* renamed from: x */
    public static boolean m118471x() {
        KeyEventCallbackC17462c keyEventCallbackC17462c = f112160a;
        if (keyEventCallbackC17462c != null) {
            return keyEventCallbackC17462c.m92868m();
        }
        return false;
    }

    /* renamed from: y */
    public static /* synthetic */ void m118472y(CheckBox checkBox, InterfaceC17463d.d dVar, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (checkBox.isChecked()) {
                AbstractC23309i.m121922fx(false);
            }
            if (dVar != null) {
                dVar.mo605K8(interfaceC17463d, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z */
    public static /* synthetic */ void m118473z(CheckBox checkBox, InterfaceC17463d interfaceC17463d, int i11) {
        if (checkBox.isChecked()) {
            AbstractC23309i.m121922fx(false);
        }
        interfaceC17463d.dismiss();
    }
}
