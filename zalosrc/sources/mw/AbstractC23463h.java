package mw;

import ae.C0766k;
import ag0.AbstractC0852x;
import ah0.C0860a;
import am.AbstractC0906d0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import b90.EnumC2667d;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.zalocloud.model.CloudQuotaUsage;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18013y0;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import k30.C21459a;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import ng0.C23743a;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p056cj.C3554v;
import p172fy.C19171b;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p716zh.C31944h6;
import p716zh.C32002l4;
import p716zh.C32098s;
import u80.C27104b0;
import ui0.C27280g;

/* renamed from: mw.h */
/* loaded from: classes4.dex */
public abstract class AbstractC23463h {

    /* renamed from: a */
    private static boolean f113974a;

    /* renamed from: mw.h$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC23456a f113975a;

        /* renamed from: b */
        final /* synthetic */ ZaloView f113976b;

        /* renamed from: c */
        final /* synthetic */ String f113977c;

        a(InterfaceC23456a interfaceC23456a, ZaloView zaloView, String str) {
            this.f113975a = interfaceC23456a;
            this.f113976b = zaloView;
            this.f113977c = str;
        }

        /* renamed from: d */
        public static final void m123196d(String str, C32002l4 c32002l4, boolean z11, ZaloView zaloView) {
            AbstractC19074t.m100208f(zaloView, "$zaloView");
            new C19171b().m101508a(new C19171b.a(zaloView.m92676n2(), new C26365a.b(str, c32002l4).m135757p(z11).m135743b(), 1009, 1));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC23456a interfaceC23456a = this.f113975a;
            if (interfaceC23456a != null) {
                interfaceC23456a.mo70063q3();
            }
            AbstractC23463h.m123193u(false);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            int m104491c = c20096c.m104491c();
            if (m104491c != 102) {
                if (m104491c != 111) {
                    if (m104491c != 515) {
                        if (m104491c != 1001) {
                            if (m104491c != 2027) {
                                switch (m104491c) {
                                    case 1010:
                                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_search_phone_error_1);
                                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                                        break;
                                    case 1011:
                                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_search_phone_error_2_desc);
                                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                                        break;
                                    case 1012:
                                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_search_phone_error_2_desc);
                                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                                        break;
                                }
                            } else {
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.TOO_MANY_REQUEST_MSG);
                                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                            }
                        } else {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_search_phone_limit);
                            AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        }
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    }
                } else {
                    m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_missparam, 111);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_error_login);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
            }
            if (!TextUtils.isEmpty(m118743r0)) {
                ToastUtils.showMess(m118743r0);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            String string;
            boolean m127126v;
            C32002l4 m154284u;
            boolean m127126v2;
            AbstractC19074t.m100208f(obj, "entity");
            boolean z11 = false;
            try {
                AbstractC23463h.m123193u(false);
                InterfaceC23456a interfaceC23456a = this.f113975a;
                if (interfaceC23456a != null) {
                    interfaceC23456a.mo70063q3();
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2.isNull("data")) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject(jSONObject2.getString("data"));
                }
                if (jSONObject != null) {
                    if (jSONObject.isNull("uid")) {
                        string = "";
                    } else {
                        string = jSONObject.getString("uid");
                    }
                    ContactProfile contactProfile = new ContactProfile(jSONObject);
                    try {
                        if (C7960e.m41971c6() != null) {
                            AbstractC19074t.m100205c(string);
                            if (string.length() > 0) {
                                m127126v2 = AbstractC24341v.m127126v(string, "null", true);
                                if (!m127126v2) {
                                    C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(string));
                                }
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                    AbstractC19074t.m100205c(string);
                    if (string.length() > 0) {
                        m127126v = AbstractC24341v.m127126v(string, "null", true);
                        if (!m127126v) {
                            if (AbstractC19074t.m100204b(string, CoreUtility.f89233i)) {
                                m154284u = C32002l4.Companion.m154288b(0, 9);
                                String str = this.f113976b.f88758Y;
                                AbstractC19074t.m100207e(str, "CLASS_NAME");
                                m154284u.m154285v("zaloView", str);
                            } else {
                                m154284u = C32002l4.Companion.m154287a(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM).m154284u(11);
                                z11 = true;
                            }
                            AbstractC19444a.m101695c(new Runnable() { // from class: mw.g

                                /* renamed from: p */
                                public final /* synthetic */ String f113970p;

                                /* renamed from: q */
                                public final /* synthetic */ C32002l4 f113971q;

                                /* renamed from: r */
                                public final /* synthetic */ boolean f113972r;

                                /* renamed from: s */
                                public final /* synthetic */ ZaloView f113973s;

                                public /* synthetic */ RunnableC23462g(String string2, C32002l4 m154284u2, boolean z112, ZaloView zaloView) {
                                    r1 = string2;
                                    r2 = m154284u2;
                                    r3 = z112;
                                    r4 = zaloView;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    AbstractC23463h.a.m123196d(r1, r2, r3, r4);
                                }
                            });
                        }
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    /* renamed from: b */
    public static final CharSequence m123174b(Context context, CharSequence charSequence, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(charSequence, "text");
        if (!C16805b.Companion.m89811a().m89809x()) {
            return charSequence;
        }
        int i12 = AbstractC23322a.zds_ic_cloud_slash_solid_24;
        if (z11) {
            i11 = AbstractC2807a.icon_04;
        } else {
            i11 = AbstractC2807a.icon_02;
        }
        Drawable m139660c = C27280g.m139660c(context, i12, i11);
        if (m139660c != null) {
            m139660c.setBounds(0, 0, AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((Object) charSequence) + "*");
            spannableStringBuilder.setSpan(new C27104b0(m139660c, AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(1.0f), 0, 8, null), charSequence.length(), spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    /* renamed from: c */
    public static /* synthetic */ CharSequence m123175c(Context context, CharSequence charSequence, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return m123174b(context, charSequence, z11);
    }

    /* renamed from: d */
    public static final KeyEventCallbackC17462c m123176d(ZaloView zaloView, Context context, Bundle bundle, InterfaceC23456a interfaceC23456a) {
        String[] strArr;
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(bundle, "bundle");
        String string = bundle.getString("text", "");
        URLSpan uRLSpan = (URLSpan) bundle.getParcelable("span");
        boolean z11 = bundle.getBoolean("is_link");
        boolean m2796b = AbstractC0906d0.m2796b(MainApplication.Companion.m35500c(), AbstractC23056e6.m118285k(string));
        if (!TextUtils.isEmpty(string) && uRLSpan != null) {
            if (z11) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_link);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_open_link);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                strArr = new String[]{m118743r0, m118743r02};
            } else if (m2796b) {
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_phone_num);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call);
                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_friend_by_phone_num);
                AbstractC19074t.m100207e(m118743r05, "getString(...)");
                strArr = new String[]{m118743r03, m118743r04, m118743r05};
            } else {
                String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_copy_phone_num);
                AbstractC19074t.m100207e(m118743r06, "getString(...)");
                String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call);
                AbstractC19074t.m100207e(m118743r07, "getString(...)");
                String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_friend_by_phone_num);
                AbstractC19074t.m100207e(m118743r08, "getString(...)");
                String m118743r09 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_save_to_phone_contact);
                AbstractC19074t.m100207e(m118743r09, "getString(...)");
                strArr = new String[]{m118743r06, m118743r07, m118743r08, m118743r09};
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, AbstractC7409c0.chat_context_menu_item, AbstractC6918a0.context_item_name, strArr);
            C8009j.a aVar = new C8009j.a(context);
            aVar.m43172u(string);
            aVar.m43155d(true);
            aVar.m43153b(arrayAdapter, new InterfaceC17463d.d() { // from class: mw.f

                /* renamed from: p */
                public final /* synthetic */ boolean f113963p;

                /* renamed from: q */
                public final /* synthetic */ Context f113964q;

                /* renamed from: r */
                public final /* synthetic */ String f113965r;

                /* renamed from: s */
                public final /* synthetic */ ZaloView f113966s;

                /* renamed from: t */
                public final /* synthetic */ InterfaceC23456a f113967t;

                /* renamed from: u */
                public final /* synthetic */ boolean f113968u;

                /* renamed from: v */
                public final /* synthetic */ URLSpan f113969v;

                public /* synthetic */ C23461f(boolean z112, Context context2, String string2, ZaloView zaloView2, InterfaceC23456a interfaceC23456a2, boolean m2796b2, URLSpan uRLSpan2) {
                    r1 = z112;
                    r2 = context2;
                    r3 = string2;
                    r4 = zaloView2;
                    r5 = interfaceC23456a2;
                    r6 = m2796b2;
                    r7 = uRLSpan2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    AbstractC23463h.m123177e(r1, r2, r3, r4, r5, r6, r7, interfaceC17463d, i11);
                }
            });
            return aVar.m43152a();
        }
        return null;
    }

    /* renamed from: e */
    public static final void m123177e(boolean z11, Context context, String str, ZaloView zaloView, InterfaceC23456a interfaceC23456a, boolean z12, URLSpan uRLSpan, InterfaceC17463d interfaceC17463d, int i11) {
        View mo70062a;
        AbstractC19074t.m100208f(context, "$context");
        AbstractC19074t.m100208f(zaloView, "$zaloView");
        AbstractC19074t.m100208f(interfaceC17463d, "dialog112");
        try {
            if (z11) {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC19074t.m100205c(str);
                        m123194v(str, zaloView);
                    }
                } else {
                    AbstractC19074t.m100205c(str);
                    ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(context, str, new SensitiveData("clipboard_access_text_csc", "comm_csc", null, 4, null));
                }
            } else {
                AbstractC23647d.m123897g("400809");
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3 && !z12) {
                                AbstractC23647d.m123897g("400804");
                                AbstractC0852x.m2336M("", str);
                            }
                        } else {
                            AbstractC23647d.m123897g("400803");
                            if (!f113974a) {
                                if (interfaceC23456a != null) {
                                    interfaceC23456a.mo70061Y();
                                }
                                f113974a = true;
                                String m121779c5 = AbstractC23309i.m121779c5();
                                if (m121779c5 == null) {
                                    m121779c5 = AbstractC23309i.m121704a5();
                                }
                                C0766k c0766k = new C0766k();
                                c0766k.mo1704o8(new a(interfaceC23456a, zaloView, str));
                                c0766k.mo1583Y9(str, m121779c5, 1);
                            }
                        }
                    } else {
                        AbstractC23647d.m123897g("400801");
                        if (interfaceC23456a != null && (mo70062a = interfaceC23456a.mo70062a()) != null) {
                            uRLSpan.onClick(mo70062a);
                        }
                        ZaloBubbleActivity.Companion.m57052d();
                    }
                } else {
                    AbstractC23647d.m123897g("400802");
                    AbstractC19074t.m100205c(str);
                    ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(context, str, new SensitiveData("clipboard_access_text_csc", "comm_csc", null, 4, null));
                }
            }
            interfaceC17463d.dismiss();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public static final SpannableString m123178f(C17945a0 c17945a0) {
        String str;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        String m95019U3 = c17945a0.m95019U3();
        AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
        if (m95019U3.length() > 0) {
            str = c17945a0.m95019U3();
        } else if (c17945a0.m94929K2().f91011p.length() > 0) {
            str = c17945a0.m94929K2().f91011p;
        } else {
            str = c17945a0.m94929K2().f91014s;
        }
        return new SpannableString(str);
    }

    /* renamed from: g */
    public static final SpannableString m123179g(C17945a0 c17945a0) {
        C18013y0 c18013y0;
        C32098s c32098s;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        C17969i0 m94929K2 = c17945a0.m94929K2();
        String str = null;
        if (m94929K2 instanceof C18013y0) {
            c18013y0 = (C18013y0) m94929K2;
        } else {
            c18013y0 = null;
        }
        if (c18013y0 != null && (c32098s = c18013y0.f91251B) != null) {
            str = c32098s.f147953c;
        }
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0) {
            if (c17945a0.m94929K2().f91011p.length() > 0) {
                str = c17945a0.m94929K2().f91011p;
            } else {
                str = c17945a0.m94929K2().f91015t;
            }
        }
        return new SpannableString(str);
    }

    /* renamed from: h */
    public static final EnumC2667d m123180h(CloudQuotaUsage cloudQuotaUsage, boolean z11) {
        EnumC2667d enumC2667d;
        AbstractC19074t.m100208f(cloudQuotaUsage, "quotaUsage");
        C23743a m89802j = C16805b.Companion.m89811a().m89802j();
        long m41231g = cloudQuotaUsage.m41231g();
        long m41232h = cloudQuotaUsage.m41232h();
        CloudQuotaUsage.AbuseInfo m41227c = cloudQuotaUsage.m41227c();
        long j11 = m41231g - m41232h;
        long j12 = 0;
        if (m41227c != null && m41227c.m41238a() > 0 && m41231g > 0 && m41232h > m41231g) {
            enumC2667d = EnumC2667d.f10681w;
        } else if (cloudQuotaUsage.m41234j()) {
            enumC2667d = EnumC2667d.f10682x;
        } else if (!cloudQuotaUsage.m41236l() && !z11) {
            enumC2667d = EnumC2667d.f10683y;
        } else if (j11 <= 0) {
            enumC2667d = EnumC2667d.f10680v;
        } else {
            C0860a.b bVar = C0860a.Companion;
            if (bVar.m2473a().m2463n() && m89802j.m124107c() > 0 && m41232h >= C21459a.m111040i(m89802j.m124107c()) && j11 > C21459a.m111040i(m89802j.m124108d())) {
                enumC2667d = EnumC2667d.f10678t;
            } else if (bVar.m2473a().m2463n() && m89802j.m124108d() > 0 && j11 <= C21459a.m111040i(m89802j.m124108d())) {
                enumC2667d = EnumC2667d.f10679u;
            } else {
                enumC2667d = EnumC2667d.f10677s;
            }
        }
        enumC2667d.m13115s(m41232h);
        enumC2667d.m13116t(m41231g);
        if (m41227c != null) {
            j12 = m41227c.m41238a();
        }
        enumC2667d.m13114r(j12);
        return enumC2667d;
    }

    /* renamed from: i */
    public static /* synthetic */ EnumC2667d m123181i(CloudQuotaUsage cloudQuotaUsage, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m123180h(cloudQuotaUsage, z11);
    }

    /* renamed from: j */
    public static final boolean m123182j(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (AbstractC25495a.m132078c(str)) {
            C21373a c21373a = C21373a.f104231a;
            if (c21373a.m110807w().m110825b() && c21373a.m110799k() == C11598e.e.f60097q.ordinal()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m123183k(C3554v c3554v) {
        AbstractC19074t.m100208f(c3554v, "searchResult");
        return AbstractC19646n0.m103003m1(c3554v.m18065g());
    }

    /* renamed from: l */
    public static final boolean m123184l(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        return c17945a0.m95276v6();
    }

    /* renamed from: m */
    public static final boolean m123185m(C3554v c3554v) {
        AbstractC19074t.m100208f(c3554v, "searchResult");
        int m18065g = c3554v.m18065g();
        if (AbstractC19646n0.m103035u1(m18065g)) {
            return true;
        }
        if (AbstractC19646n0.m103044x1(m18065g) && C31944h6.m153548n(c3554v.m18060b()).length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final boolean m123186n(C17945a0 c17945a0) {
        if (c17945a0 == null) {
            return false;
        }
        if (c17945a0.m94960N7()) {
            return true;
        }
        if (!c17945a0.m95208n8()) {
            return false;
        }
        String m95019U3 = c17945a0.m95019U3();
        AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
        if (C31944h6.m153548n(m95019U3).length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static final boolean m123187o(C3554v c3554v) {
        AbstractC19074t.m100208f(c3554v, "searchResult");
        int m18065g = c3554v.m18065g();
        if (!AbstractC19646n0.m103031t1(m18065g) && !AbstractC19646n0.m102886D1(m18065g)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static final boolean m123188p(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (!c17945a0.m94871D7() && !c17945a0.m95306y8()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static final boolean m123189q(C3554v c3554v) {
        AbstractC19074t.m100208f(c3554v, "searchResult");
        int m18065g = c3554v.m18065g();
        if (!AbstractC19646n0.m103044x1(m18065g) && !AbstractC19646n0.m103031t1(m18065g) && !AbstractC19646n0.m102995k1(m18065g) && !AbstractC19646n0.m102886D1(m18065g) && !AbstractC19646n0.m103003m1(m18065g) && !AbstractC19646n0.m102889E1(m18065g) && !AbstractC19646n0.m103035u1(m18065g) && !AbstractC19646n0.m103015p1(m18065g)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static final boolean m123190r(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (!c17945a0.m95208n8() && !c17945a0.m94871D7() && !c17945a0.m95120e6() && !c17945a0.m95306y8() && !c17945a0.m95276v6() && !c17945a0.m95316z8() && !c17945a0.m94960N7() && !c17945a0.m94942L7() && !c17945a0.m94949M6()) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public static final boolean m123191s(C3554v c3554v) {
        AbstractC19074t.m100208f(c3554v, "searchResult");
        int m18065g = c3554v.m18065g();
        if (!AbstractC19646n0.m103044x1(m18065g) && !AbstractC19646n0.m103035u1(m18065g)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static final boolean m123192t(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (!c17945a0.m95208n8() && (!c17945a0.m94960N7() || c17945a0.m94929K2().f91011p.length() <= 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public static final void m123193u(boolean z11) {
        f113974a = z11;
    }

    /* renamed from: v */
    public static final void m123194v(String str, ZaloView zaloView) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(zaloView, "zaloView");
        try {
            int m40666e = TrackingSource.m40666e();
            String m40669h = TrackingSource.m40669h(m40666e);
            AbstractC19074t.m100207e(m40669h, "genSourceParamChat(...)");
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", str);
            bundle.putInt("EXTRA_SOURCE_LINK", m40666e);
            if (!TextUtils.isEmpty(m40669h)) {
                bundle.putString("EXTRA_SOURCE_PARAM", m40669h);
            }
            InterfaceC27218a m92676n2 = zaloView.m92676n2();
            if (m92676n2 != null) {
                ZaloWebView.Companion.m87171F(m92676n2, str, bundle);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
