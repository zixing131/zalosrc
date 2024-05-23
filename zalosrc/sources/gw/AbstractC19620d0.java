package gw;

import am.C0943w;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.RichTextFormat;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.social.controls.MentionSpan;
import com.zing.zalo.social.controls.SuggestionTimeSpan;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17946a1;
import dj.C17958e1;
import dj.C17967h1;
import dj.C17969i0;
import dj.C17970i1;
import dj.C17972j0;
import dj.C17978l0;
import dj.C17984n0;
import dj.C17990p0;
import dj.C17997r1;
import dj.C17999s0;
import dj.C18005u0;
import dj.C18013y0;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23165o5;
import me0.AbstractC23184q2;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p105dn.EnumC18030a;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p394oj.C24275a;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import p716zh.C32076q5;
import p716zh.C32098s;
import pm0.C24860q;
import vg.C28203u6;

/* renamed from: gw.d0 */
/* loaded from: classes4.dex */
public abstract class AbstractC19620d0 {

    /* renamed from: gw.d0$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f97424a;

        static {
            int[] iArr = new int[EnumC18030a.values().length];
            try {
                iArr[EnumC18030a.SINGLE_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18030a.SINGLE_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC18030a.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97424a = iArr;
        }
    }

    /* renamed from: A */
    public static final SpannableStringBuilder m102664A(String str, MentionSpan[] mentionSpanArr, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(mentionSpanArr, "mentionSpans");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (MentionSpan mentionSpan : mentionSpanArr) {
            int i11 = mentionSpan.f54787r;
            if (i11 < 3000) {
                spannableStringBuilder.setSpan(mentionSpan, mentionSpan.f54786q, i11, 33);
                if (interfaceC18505l != null) {
                    interfaceC18505l.mo205i9(Long.valueOf(mentionSpan.f54788s));
                }
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: B */
    public static final C24860q m102665B(String str) {
        AbstractC19074t.m100208f(str, "data");
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("msg");
        C7907e c7907e = new C7907e();
        if (jSONObject.has("mentions")) {
            JSONArray jSONArray = jSONObject.getJSONArray("mentions");
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                C7907e.a aVar = new C7907e.a();
                aVar.m40869g(jSONObject2.getLong("uid"), jSONObject2.getInt("pos"), jSONObject2.getInt("len"));
                c7907e.m40852b(aVar);
            }
        }
        List m40857g = c7907e.m40857g();
        AbstractC19074t.m100205c(m40857g);
        AbstractC19074t.m100205c(optString);
        String m102677N = m102677N(m40857g, optString, null, null, null, null, 60, null);
        ArrayList m102673J = m102673J(m40857g, m102677N);
        if (m102677N.length() > 3000) {
            m102677N = m102677N.substring(0, 3000);
            AbstractC19074t.m100207e(m102677N, "substring(...)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m102677N);
        Iterator it = m102673J.iterator();
        while (it.hasNext()) {
            MentionSpan mentionSpan = (MentionSpan) it.next();
            if (mentionSpan.f54787r < m102677N.length()) {
                spannableStringBuilder.setSpan(mentionSpan, mentionSpan.f54786q, mentionSpan.f54787r, 33);
            }
        }
        return new C24860q(spannableStringBuilder, Integer.valueOf(m102677N.length()));
    }

    /* renamed from: C */
    public static final SpannableStringBuilder m102666C(Editable editable, String str, long j11, boolean z11) {
        String m114542i;
        StringBuilder sb2;
        int length;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable);
        C28203u6 c28203u6 = C28203u6.f131407a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(j11);
        ContactProfile m141810d = c28203u6.m141810d(sb3.toString(), new TrackingSource((short) 1015));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(j11);
        String sb5 = sb4.toString();
        if (m141810d != null) {
            m114542i = m141810d.m40383Q(true, false);
        } else {
            m114542i = AbstractC21935u.m114542i(String.valueOf(j11), str);
        }
        String str2 = "@" + AbstractC23184q2.m119453k(sb5, m114542i, "");
        if (m141810d != null) {
            String mo2475c = m141810d.mo2475c();
            sb2 = new StringBuilder();
            sb2.append("@");
            sb2.append(mo2475c);
        } else {
            sb2 = new StringBuilder();
            sb2.append("@");
            sb2.append(str);
        }
        String sb6 = sb2.toString();
        String str3 = str2 + " ";
        if (z11) {
            length = 0;
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            length = spannableStringBuilder.length();
        }
        spannableStringBuilder.insert(length, (CharSequence) str3);
        MentionSpan mentionSpan = new MentionSpan(0, length, length + str2.length(), j11, sb6, str2);
        spannableStringBuilder.setSpan(mentionSpan, mentionSpan.f54786q, mentionSpan.f54787r, 33);
        return spannableStringBuilder;
    }

    /* renamed from: D */
    public static final SpannableStringBuilder m102667D(String str, C7907e c7907e) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(c7907e, "mentions");
        StringBuilder sb2 = new StringBuilder(str);
        ArrayList<MentionSpan> arrayList = new ArrayList();
        int m40861l = c7907e.m40861l();
        int i11 = 0;
        for (int i12 = 0; i12 < m40861l; i12++) {
            C7907e.a m40855e = c7907e.m40855e(i12);
            C28203u6 c28203u6 = C28203u6.f131407a;
            long j11 = m40855e.f42792b;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j11);
            ContactProfile m141800i = C28203u6.m141800i(c28203u6, sb3.toString(), false, 2, null);
            if (m141800i != null) {
                int i13 = m40855e.f42795e;
                String substring = sb2.substring(i13 + i11, i13 + i11 + m40855e.f42794d);
                AbstractC19074t.m100207e(substring, "substring(...)");
                String str2 = "@" + m141800i.m40383Q(true, false);
                int i14 = m40855e.f42795e;
                sb2.replace(i14 + i11, i14 + i11 + m40855e.f42794d, str2);
                int i15 = m40855e.f42795e;
                arrayList.add(new MentionSpan(0, i15 + i11, i15 + i11 + str2.length(), m40855e.f42792b, substring, str2));
                i11 += str2.length() - substring.length();
            } else {
                int i16 = m40855e.f42795e;
                String substring2 = sb2.substring(i16 + i11, i16 + i11 + m40855e.f42794d);
                AbstractC19074t.m100207e(substring2, "substring(...)");
                int i17 = m40855e.f42795e;
                arrayList.add(new MentionSpan(0, i17 + i11, i17 + i11 + substring2.length(), m40855e.f42792b, substring2, substring2));
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        for (MentionSpan mentionSpan : arrayList) {
            spannableStringBuilder.setSpan(mentionSpan, mentionSpan.f54786q, mentionSpan.f54787r, 33);
        }
        return spannableStringBuilder;
    }

    /* renamed from: E */
    public static final String m102668E(ContactProfile contactProfile, C17945a0 c17945a0, boolean z11) {
        String m118743r0;
        String m118743r02;
        C18013y0 c18013y0;
        C18013y0 c18013y02;
        String str;
        String str2;
        String m95019U3;
        C32098s c32098s;
        C32098s c32098s2;
        String m118743r03;
        String m118743r04;
        String m118743r05;
        String m118743r06;
        String m118743r07;
        String m118743r08;
        String m118743r09;
        String m118743r010;
        String m118743r011;
        AbstractC19074t.m100208f(contactProfile, "contact");
        AbstractC19074t.m100208f(c17945a0, "msg");
        String str3 = "";
        if (c17945a0.m94871D7()) {
            if (!z11 && c17945a0.m94995R6() && c17945a0.m94929K2() != null) {
                String str4 = c17945a0.m94929K2().f91011p;
                List m40857g = c17945a0.m95011T3().m40857g();
                AbstractC19074t.m100205c(m40857g);
                if (c17945a0.m94847A6()) {
                    str3 = c17945a0.mo95039W2();
                }
                String str5 = str3;
                AbstractC19074t.m100205c(str5);
                return m102677N(m40857g, str4, str5, null, null, null, 56, null);
            }
            if (contactProfile.m40374K0()) {
                String m118743r012 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_photo_to_group);
                AbstractC19074t.m100207e(m118743r012, "getString(...)");
                return m118743r012;
            }
            String m118743r013 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_photo);
            AbstractC19074t.m100207e(m118743r013, "getString(...)");
            return m118743r013;
        }
        if (c17945a0.m95120e6()) {
            if (contactProfile.m40374K0()) {
                m118743r011 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_doodle_to_group);
            } else {
                m118743r011 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_doodle);
            }
            AbstractC19074t.m100205c(m118743r011);
            return m118743r011;
        }
        if (!c17945a0.m95110d8() && !c17945a0.m94890F7()) {
            if (c17945a0.m95306y8()) {
                if (c17945a0.m95288w8()) {
                    if (contactProfile.m40374K0()) {
                        m118743r010 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_gif_to_group);
                    } else {
                        m118743r010 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_gif);
                    }
                } else if (contactProfile.m40374K0()) {
                    m118743r010 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_video_to_group);
                } else {
                    m118743r010 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_video);
                }
                AbstractC19074t.m100205c(m118743r010);
                return m118743r010;
            }
            if (c17945a0.m95316z8()) {
                if (contactProfile.m40374K0()) {
                    m118743r09 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_voice_to_group);
                } else {
                    m118743r09 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_voice);
                }
                AbstractC19074t.m100205c(m118743r09);
                return m118743r09;
            }
            if (c17945a0.m95314z6()) {
                if (contactProfile.m40374K0()) {
                    m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_gif_to_group);
                } else {
                    m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_gif);
                }
                AbstractC19074t.m100205c(m118743r08);
                return m118743r08;
            }
            if (c17945a0.m95276v6()) {
                if (c17945a0.m94929K2() instanceof C17990p0) {
                    C17969i0 m94929K2 = c17945a0.m94929K2();
                    AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
                    if (((C17990p0) m94929K2).m95670k()) {
                        if (contactProfile.m40374K0()) {
                            m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_folder_to_group);
                        } else {
                            m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_folder);
                        }
                        AbstractC19074t.m100205c(m118743r07);
                        return m118743r07;
                    }
                }
                if (contactProfile.m40374K0()) {
                    m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_file_to_group);
                } else {
                    m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_file);
                }
                AbstractC19074t.m100205c(m118743r07);
                return m118743r07;
            }
            if (c17945a0.m95015T7()) {
                String m118743r014 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_link);
                AbstractC19074t.m100207e(m118743r014, "getString(...)");
                return m118743r014;
            }
            if (c17945a0.m95226p6()) {
                String m118743r015 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_ecard);
                AbstractC19074t.m100207e(m118743r015, "getString(...)");
                return m118743r015;
            }
            if (c17945a0.m95217o6()) {
                String m118743r016 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_ecard_info);
                AbstractC19074t.m100207e(m118743r016, "getString(...)");
                return m118743r016;
            }
            if (c17945a0.m95031V5()) {
                String m118743r017 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_chang_chat_theme);
                AbstractC19074t.m100207e(m118743r017, "getString(...)");
                return m118743r017;
            }
            if (c17945a0.m94949M6()) {
                if (contactProfile.m40374K0()) {
                    m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_location_to_group);
                } else {
                    m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_location);
                }
                AbstractC19074t.m100205c(m118743r06);
                return m118743r06;
            }
            if (c17945a0.m94941L6()) {
                if (c17945a0.m94847A6()) {
                    m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_live_location_sharing_in_group_v2);
                } else {
                    m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_live_location_sharing_with_you_v2);
                }
                AbstractC19074t.m100205c(m118743r05);
                return m118743r05;
            }
            String str6 = null;
            C17999s0 c17999s0 = null;
            if (c17945a0.m95298x8()) {
                C17969i0 m94929K22 = c17945a0.m94929K2();
                if (m94929K22 instanceof C17999s0) {
                    c17999s0 = (C17999s0) m94929K22;
                }
                if (c17999s0 != null && c17999s0.f91168B) {
                    m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.ls_noti_end_live_streaming);
                } else {
                    m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.ls_noti_live_streaming);
                }
                AbstractC19074t.m100205c(m118743r04);
                return m118743r04;
            }
            if (c17945a0.m95219o8()) {
                String m118743r018 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_undo);
                AbstractC19074t.m100207e(m118743r018, "getString(...)");
                return m118743r018;
            }
            if (c17945a0.m95091b6()) {
                if (c17945a0.m94929K2() != null && (c17945a0.m94929K2() instanceof C17958e1)) {
                    C17969i0 m94929K23 = c17945a0.m94929K2();
                    AbstractC19074t.m100206d(m94929K23, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentUndo");
                    if (((C17958e1) m94929K23).m95421j().length() > 0) {
                        C17969i0 m94929K24 = c17945a0.m94929K2();
                        AbstractC19074t.m100206d(m94929K24, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentUndo");
                        m118743r03 = AbstractC19646n0.m102890F(new JSONObject(((C17958e1) m94929K24).m95421j()), 20);
                        AbstractC19074t.m100205c(m118743r03);
                        return m118743r03;
                    }
                }
                m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_delete_for_everyone_by_admin);
                AbstractC19074t.m100205c(m118743r03);
                return m118743r03;
            }
            if (c17945a0.m94977P7()) {
                C17969i0 m94929K25 = c17945a0.m94929K2();
                boolean z12 = m94929K25 instanceof C18013y0;
                if (z12) {
                    c18013y0 = (C18013y0) m94929K25;
                } else {
                    c18013y0 = null;
                }
                if (c18013y0 != null && (c32098s2 = c18013y0.f91251B) != null && c32098s2.m154943m()) {
                    if (contactProfile.m40374K0()) {
                        m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_zalo_video_profile_link_to_group);
                    } else {
                        m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_zalo_video_profile_link);
                    }
                } else {
                    if (z12) {
                        c18013y02 = (C18013y0) m94929K25;
                    } else {
                        c18013y02 = null;
                    }
                    if (c18013y02 != null && (c32098s = c18013y02.f91251B) != null && c32098s.m154944n()) {
                        if (contactProfile.m40374K0()) {
                            m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_zalo_video_content_link_to_group);
                        } else {
                            m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_zalo_video_content_link);
                        }
                    } else {
                        if (m94929K25 != null) {
                            str = m94929K25.f91016u;
                        } else {
                            str = null;
                        }
                        if (AbstractC19074t.m100204b(str, "recommened.link")) {
                            if (contactProfile.m40374K0()) {
                                m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_link_to_group);
                            } else {
                                m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_link);
                            }
                        } else {
                            if (m94929K25 != null) {
                                str2 = m94929K25.f91016u;
                            } else {
                                str2 = null;
                            }
                            if (AbstractC19074t.m100204b(str2, "recommened.user")) {
                                if (contactProfile.m40374K0()) {
                                    m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_send_type_contact_recommend_to_group);
                                } else {
                                    m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_send_type_contact_recommend);
                                }
                            } else {
                                if (m94929K25 != null) {
                                    str6 = m94929K25.f91016u;
                                }
                                if (AbstractC19074t.m100204b(str6, "recommened.vip")) {
                                    if (contactProfile.m40374K0()) {
                                        C19067n0 c19067n0 = C19067n0.f94947a;
                                        String m118743r019 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_send_type_oa_recommend_to_group);
                                        AbstractC19074t.m100207e(m118743r019, "getString(...)");
                                        m95019U3 = String.format(m118743r019, Arrays.copyOf(new Object[]{m94929K25.f91011p}, 1));
                                        AbstractC19074t.m100207e(m95019U3, "format(...)");
                                    } else {
                                        C19067n0 c19067n02 = C19067n0.f94947a;
                                        String m118743r020 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_send_type_oa_recommend);
                                        AbstractC19074t.m100207e(m118743r020, "getString(...)");
                                        m95019U3 = String.format(m118743r020, Arrays.copyOf(new Object[]{m94929K25.f91011p}, 1));
                                        AbstractC19074t.m100207e(m95019U3, "format(...)");
                                    }
                                } else {
                                    m95019U3 = c17945a0.m95019U3();
                                }
                            }
                        }
                    }
                }
                AbstractC19074t.m100205c(m95019U3);
                return m95019U3;
            }
            String m95019U32 = c17945a0.m95019U3();
            if (c17945a0.m95011T3() != null && !z11) {
                List m40857g2 = c17945a0.m95011T3().m40857g();
                AbstractC19074t.m100205c(m40857g2);
                AbstractC19074t.m100205c(m95019U32);
                if (c17945a0.m94847A6()) {
                    str3 = c17945a0.mo95039W2();
                }
                String str7 = str3;
                AbstractC19074t.m100205c(str7);
                m95019U32 = m102677N(m40857g2, m95019U32, str7, null, null, null, 56, null);
            }
            if (c17945a0.m95208n8()) {
                AbstractC19074t.m100205c(m95019U32);
                if (m95019U32.length() == 0 && c17945a0.m95275v4() != null) {
                    m95019U32 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_reply);
                } else if (c17945a0.m95239r4() != null && c17945a0.m95239r4().f91139a == 1) {
                    String str8 = c17945a0.m95239r4().f91140b;
                    AbstractC19074t.m100207e(str8, "data");
                    if (str8.length() > 0) {
                        m95019U32 = AbstractC23136l9.m118743r0(AbstractC8020f0.noti_ref_text) + " " + m95019U32;
                    }
                }
                if (z11 && AbstractC23304d.f113266D0) {
                    if (contactProfile.m40374K0()) {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_msg_psscode_enable_to_group);
                    } else {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_msg_psscode_enable);
                    }
                    m95019U32 = m118743r02;
                }
                AbstractC19074t.m100205c(m95019U32);
            } else {
                AbstractC19074t.m100205c(m95019U32);
            }
            return m95019U32;
        }
        if (contactProfile.m40374K0()) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_sticker_to_group);
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_sent_type_sticker);
        }
        AbstractC19074t.m100205c(m118743r0);
        return m118743r0;
    }

    /* renamed from: F */
    public static final String m102669F(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        String m119211P = AbstractC23160o0.m119211P(AbstractC19646n0.m102894G0(c17945a0.mo95039W2(), c17945a0.m94862C4()) * 1000);
        AbstractC19074t.m100207e(m119211P, "getDateTimeString(...)");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_timeout_delete_msg_for_everyone);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m119211P}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: G */
    public static final String m102670G() {
        String m119211P = AbstractC23160o0.m119211P(AbstractC23309i.m121708a9() * 1000);
        AbstractC19074t.m100207e(m119211P, "getDateTimeString(...)");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_timeout_recall_msg);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m119211P}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: H */
    public static final String m102671H(List list, boolean z11) {
        String string;
        AbstractC19074t.m100208f(list, "chatContents");
        Context m35500c = MainApplication.Companion.m35500c();
        boolean z12 = false;
        if (((C17945a0) list.get(0)).m94847A6()) {
            boolean m102955a1 = AbstractC19646n0.m102955a1(list);
            if (list.size() > 1) {
                z12 = true;
            }
            if (m102955a1) {
                if (z11) {
                    if (z12) {
                        string = m35500c.getResources().getString(AbstractC8020f0.str_delete_multiple_media_message_for_all_members_desc);
                    } else {
                        string = m35500c.getResources().getString(AbstractC8020f0.str_delete_single_media_message_for_all_members_desc);
                    }
                } else if (z12) {
                    string = m35500c.getResources().getString(AbstractC8020f0.str_delete_multiple_media_message_for_me_desc);
                } else {
                    string = m35500c.getResources().getString(AbstractC8020f0.str_delete_single_media_message_for_me_desc);
                }
            } else if (z11) {
                string = m35500c.getResources().getString(AbstractC8020f0.str_delete_multi_for_all_members_message);
            } else {
                string = m35500c.getResources().getString(AbstractC8020f0.str_delete_multi_for_me_message);
            }
            AbstractC19074t.m100205c(string);
            return string;
        }
        String string2 = m35500c.getResources().getString(AbstractC8020f0.str_delete_multi_for_me_message);
        AbstractC19074t.m100205c(string2);
        return string2;
    }

    /* renamed from: I */
    public static final String m102672I(List list) {
        AbstractC19074t.m100208f(list, "chatContents");
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            if (((C17945a0) list.get(i14)).m95288w8()) {
                i11++;
            } else if (((C17945a0) list.get(i14)).m94871D7()) {
                i12++;
            } else if (((C17945a0) list.get(i14)).m95306y8()) {
                i13++;
            }
            if (i12 >= 1 && i13 >= 1) {
                break;
            }
        }
        if (i12 >= 1 && i13 >= 1) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_photo_and_video_group_title_dialog);
            AbstractC19074t.m100205c(m118743r0);
            return m118743r0;
        }
        if (i12 >= 1) {
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_photo_group_title_dialog);
            AbstractC19074t.m100205c(m118743r02);
            return m118743r02;
        }
        if (i13 >= 1) {
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_video_group_title_dialog);
            AbstractC19074t.m100205c(m118743r03);
            return m118743r03;
        }
        if (i11 >= 1) {
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_gif_group_title_dialog);
            AbstractC19074t.m100205c(m118743r04);
            return m118743r04;
        }
        return "";
    }

    /* renamed from: J */
    public static final ArrayList m102673J(List list, String str) {
        AbstractC19074t.m100208f(list, "preProcessMentionList");
        AbstractC19074t.m100208f(str, "textMessage");
        try {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                C7907e.a aVar = (C7907e.a) list.get(i11);
                int i12 = aVar.f42795e;
                if (i12 >= 0 && i12 + aVar.f42794d <= str.length()) {
                    int i13 = aVar.f42791a;
                    int i14 = aVar.f42795e;
                    arrayList.add(new MentionSpan(i13, i14, i14 + aVar.f42794d, aVar.f42792b, aVar.f42797g, aVar.f42796f));
                }
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MessageTextUtils", e11);
            return new ArrayList();
        }
    }

    /* renamed from: K */
    public static final String m102674K(List list, String str) {
        AbstractC19074t.m100208f(list, "preProcessMentionList");
        AbstractC19074t.m100208f(str, "msg");
        return m102677N(list, str, null, null, null, null, 60, null);
    }

    /* renamed from: L */
    public static final String m102675L(List list, String str, String str2) {
        AbstractC19074t.m100208f(list, "preProcessMentionList");
        AbstractC19074t.m100208f(str, "msg");
        AbstractC19074t.m100208f(str2, "groupId");
        return m102677N(list, str, str2, null, null, null, 56, null);
    }

    /* renamed from: M */
    public static final String m102676M(List list, String str, String str2, List list2, List list3, List list4) {
        String str3;
        int size;
        int size2;
        int m40648d;
        int size3;
        int size4;
        List list5 = list;
        String str4 = str2;
        AbstractC19074t.m100208f(list5, "preProcessMentionList");
        AbstractC19074t.m100208f(str, "msg");
        AbstractC19074t.m100208f(str4, "groupId");
        try {
            StringBuilder sb2 = new StringBuilder(str);
            if (list2 != null && list2.size() - 1 >= 0) {
                while (true) {
                    int i11 = size4 - 1;
                    ((SuggestionTimeSpan) list2.get(size4)).f54800p = ((SuggestionTimeSpan) list2.get(size4)).f54802r;
                    ((SuggestionTimeSpan) list2.get(size4)).f54801q = ((SuggestionTimeSpan) list2.get(size4)).f54803s;
                    if (i11 < 0) {
                        break;
                    }
                    size4 = i11;
                }
            }
            if (list3 != null && list3.size() - 1 >= 0) {
                while (true) {
                    int i12 = size3 - 1;
                    ((SuggestionTimeSpan) list3.get(size3)).f54800p = ((SuggestionTimeSpan) list3.get(size3)).f54802r;
                    ((SuggestionTimeSpan) list3.get(size3)).f54801q = ((SuggestionTimeSpan) list3.get(size3)).f54803s;
                    if (i12 < 0) {
                        break;
                    }
                    size3 = i12;
                }
            }
            boolean z11 = false;
            if (list4 != null) {
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    RichTextFormat richTextFormat = (RichTextFormat) it.next();
                    richTextFormat.m40652i(0);
                    richTextFormat.m40651h(0);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((C7907e.a) it2.next()).m40867e();
            }
            int size5 = list.size();
            int i13 = 0;
            while (i13 < size5) {
                C7907e.a aVar = (C7907e.a) list5.get(i13);
                if (aVar.f42795e + aVar.f42794d <= sb2.length()) {
                    int i14 = aVar.f42795e;
                    String substring = sb2.substring(i14, aVar.f42794d + i14);
                    AbstractC19074t.m100205c(substring);
                    if (substring.length() != 0) {
                        long j11 = aVar.f42792b;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(j11);
                        String sb4 = sb3.toString();
                        if (aVar.f42791a == 0) {
                            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, sb4, null, 2, null);
                            if (m141798e != null) {
                                str3 = "@" + AbstractC23184q2.m119453k(sb4, m141798e.m40383Q(true, z11), str4);
                            } else {
                                String substring2 = substring.substring(1);
                                AbstractC19074t.m100207e(substring2, "substring(...)");
                                str3 = "@" + AbstractC23184q2.m119453k(sb4, AbstractC21935u.m114542i(sb4, substring2), str4);
                            }
                        } else {
                            str3 = substring;
                        }
                        int length = str3.length() - substring.length();
                        if (length != 0) {
                            int size6 = list.size();
                            for (int i15 = i13 + 1; i15 < size6; i15++) {
                                ((C7907e.a) list5.get(i15)).f42795e += length;
                            }
                            if (list4 != null) {
                                Iterator it3 = list4.iterator();
                                while (it3.hasNext()) {
                                    RichTextFormat richTextFormat2 = (RichTextFormat) it3.next();
                                    int i16 = aVar.f42795e;
                                    int i17 = aVar.f42794d + i16;
                                    int i18 = i16 + 1;
                                    int m40650f = richTextFormat2.m40650f();
                                    if ((i18 > m40650f || m40650f > i17) && (i16 > (m40648d = richTextFormat2.m40648d()) || m40648d >= i17)) {
                                        if (richTextFormat2.m40650f() > i17) {
                                            richTextFormat2.m40652i(richTextFormat2.m40647c() + length);
                                        }
                                        if (richTextFormat2.m40648d() >= i17) {
                                            richTextFormat2.m40651h(richTextFormat2.m40646b() + length);
                                        }
                                    }
                                    it3.remove();
                                }
                            }
                        }
                        if (list2 != null && list2.size() - 1 >= 0) {
                            while (true) {
                                int i19 = size2 - 1;
                                if (length != 0 && ((SuggestionTimeSpan) list2.get(size2)).f54800p > aVar.f42795e + aVar.f42794d) {
                                    ((SuggestionTimeSpan) list2.get(size2)).f54800p += length;
                                    ((SuggestionTimeSpan) list2.get(size2)).f54801q += length;
                                } else if (((SuggestionTimeSpan) list2.get(size2)).f54800p >= aVar.f42795e && ((SuggestionTimeSpan) list2.get(size2)).f54800p <= aVar.f42795e + aVar.f42794d) {
                                    list2.remove(size2);
                                }
                                if (i19 < 0) {
                                    break;
                                }
                                size2 = i19;
                            }
                        }
                        if (list3 != null && list3.size() - 1 >= 0) {
                            while (true) {
                                int i21 = size - 1;
                                if (length != 0 && ((SuggestionTimeSpan) list3.get(size)).f54800p > aVar.f42795e + aVar.f42794d) {
                                    ((SuggestionTimeSpan) list3.get(size)).f54800p += length;
                                    ((SuggestionTimeSpan) list3.get(size)).f54801q += length;
                                } else if (((SuggestionTimeSpan) list3.get(size)).f54800p >= aVar.f42795e && ((SuggestionTimeSpan) list3.get(size)).f54800p <= aVar.f42795e + aVar.f42794d) {
                                    list3.remove(size);
                                }
                                if (i21 < 0) {
                                    break;
                                }
                                size = i21;
                            }
                        }
                        int i22 = aVar.f42795e;
                        sb2.replace(i22, aVar.f42794d + i22, str3);
                        aVar.f42794d = str3.length();
                        aVar.f42797g = substring;
                        aVar.f42796f = str3;
                    }
                }
                i13++;
                z11 = false;
                list5 = list;
                str4 = str2;
            }
            String sb5 = sb2.toString();
            AbstractC19074t.m100207e(sb5, "toString(...)");
            return sb5;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MessageTextUtils", e11);
            return str;
        }
    }

    /* renamed from: N */
    public static /* synthetic */ String m102677N(List list, String str, String str2, List list2, List list3, List list4, int i11, Object obj) {
        List list5;
        List list6;
        List list7;
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i11 & 8) != 0) {
            list5 = null;
        } else {
            list5 = list2;
        }
        if ((i11 & 16) != 0) {
            list6 = null;
        } else {
            list6 = list3;
        }
        if ((i11 & 32) != 0) {
            list7 = null;
        } else {
            list7 = list4;
        }
        return m102676M(list, str, str3, list5, list6, list7);
    }

    /* renamed from: O */
    public static final String m102678O(List list, String str, String str2) {
        int i11;
        String str3;
        AbstractC19074t.m100208f(list, "preProcessMentionList");
        AbstractC19074t.m100208f(str, "msg");
        AbstractC19074t.m100208f(str2, "groupId");
        StringBuilder sb2 = new StringBuilder(str);
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C7907e.a) it.next()).m40867e();
            }
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C7907e.a aVar = (C7907e.a) list.get(i12);
                if (aVar.f42792b > 0 && (i11 = aVar.f42795e) >= 0 && i11 + aVar.f42794d <= sb2.length()) {
                    int i13 = aVar.f42795e;
                    String substring = sb2.substring(i13, aVar.f42794d + i13);
                    AbstractC19074t.m100205c(substring);
                    if (substring.length() != 0) {
                        C28203u6 c28203u6 = C28203u6.f131407a;
                        long j11 = aVar.f42792b;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(j11);
                        ContactProfile m141798e = C28203u6.m141798e(c28203u6, sb3.toString(), null, 2, null);
                        if (m141798e != null) {
                            str3 = m141798e.m40383Q(true, false);
                        } else {
                            str3 = substring;
                        }
                        if (!aVar.f42798h) {
                            long j12 = aVar.f42792b;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(j12);
                            str3 = AbstractC23184q2.m119453k(sb4.toString(), str3, str2);
                        }
                        int length = str3.length() - substring.length();
                        if (length != 0) {
                            int size2 = list.size();
                            for (int i14 = i12 + 1; i14 < size2; i14++) {
                                ((C7907e.a) list.get(i14)).f42795e += length;
                            }
                        }
                        int i15 = aVar.f42795e;
                        sb2.replace(i15, aVar.f42794d + i15, str3);
                        aVar.f42794d = str3.length();
                    }
                }
            }
            String sb5 = sb2.toString();
            AbstractC19074t.m100207e(sb5, "toString(...)");
            return sb5;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MessageTextUtils", e11);
            return str;
        }
    }

    /* renamed from: P */
    private static final CharSequence m102679P(CharSequence charSequence, C17945a0 c17945a0) {
        String str;
        String str2;
        if (c17945a0.m95226p6()) {
            if (c17945a0.m94929K2() instanceof C17984n0) {
                C17969i0 m94929K2 = c17945a0.m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentECard");
                String str3 = ((C17984n0) m94929K2).f91082E;
                AbstractC19074t.m100205c(str3);
                if (str3.length() > 0) {
                    C17969i0 m94929K22 = c17945a0.m94929K2();
                    AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentECard");
                    if (((C17984n0) m94929K22).f91087J != null) {
                        C17969i0 m94929K23 = c17945a0.m94929K2();
                        AbstractC19074t.m100206d(m94929K23, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentECard");
                        List m40857g = ((C17984n0) m94929K23).f91087J.m40857g();
                        AbstractC19074t.m100205c(m40857g);
                        AbstractC19074t.m100205c(str3);
                        if (c17945a0.m94847A6()) {
                            str2 = c17945a0.mo95039W2();
                        } else {
                            str2 = "";
                        }
                        AbstractC19074t.m100205c(str2);
                        str = m102678O(m40857g, str3, str2);
                    } else {
                        str = str3;
                    }
                    AbstractC19074t.m100205c(str);
                    return str;
                }
                return charSequence;
            }
            return charSequence;
        }
        if (c17945a0.m95261t6()) {
            if (c17945a0.m95205n3() != null) {
                String str4 = c17945a0.m95205n3().m14322a0().f12049c0;
                AbstractC19074t.m100207e(str4, "notifyTxt");
                if (str4.length() > 0) {
                    String str5 = c17945a0.m95205n3().m14322a0().f12049c0;
                    AbstractC19074t.m100207e(str5, "notifyTxt");
                    return str5;
                }
                return charSequence;
            }
            return charSequence;
        }
        if (!c17945a0.m94899G7() && !c17945a0.m95161i7()) {
            if (c17945a0.m94872D8() && !c17945a0.m94865C8() && c17945a0.m95005S6()) {
                String m95019U3 = c17945a0.m95019U3();
                AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
                if (m95019U3.length() > 0) {
                    String m95019U32 = c17945a0.m95019U3();
                    AbstractC19074t.m100207e(m95019U32, "getMessage(...)");
                    return m95019U32;
                }
                return charSequence;
            }
            return charSequence;
        }
        String m95019U33 = c17945a0.m95019U3();
        AbstractC19074t.m100207e(m95019U33, "getMessage(...)");
        return m95019U33;
    }

    /* renamed from: Q */
    private static final CharSequence m102680Q(CharSequence charSequence, ContactProfile contactProfile, C17945a0 c17945a0) {
        if (contactProfile.m40374K0()) {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, c17945a0.m94862C4(), null, 2, null);
            if (m141798e != null) {
                String mo2475c = contactProfile.mo2475c();
                AbstractC19074t.m100207e(mo2475c, "getDpn(...)");
                String mo2478b = contactProfile.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                return m102690j(charSequence, mo2475c, m141798e, mo2478b, contactProfile.m40363E0());
            }
            return charSequence;
        }
        ContactProfile m141798e2 = C28203u6.m141798e(C28203u6.f131407a, c17945a0.m94862C4(), null, 2, null);
        if (m141798e2 != null) {
            return m102691k(charSequence, m141798e2);
        }
        return charSequence;
    }

    /* renamed from: a */
    private static final String m102681a(C17945a0 c17945a0) {
        String str;
        String m95019U3 = c17945a0.m95019U3();
        if (c17945a0.m95011T3() != null && !AbstractC23165o5.m119333b()) {
            List m40857g = c17945a0.m95011T3().m40857g();
            AbstractC19074t.m100205c(m40857g);
            AbstractC19074t.m100205c(m95019U3);
            if (c17945a0.m94847A6()) {
                str = c17945a0.mo95039W2();
            } else {
                str = "";
            }
            AbstractC19074t.m100205c(str);
            m95019U3 = m102677N(m40857g, m95019U3, str, null, null, null, 56, null);
        }
        if (c17945a0.m95208n8()) {
            AbstractC19074t.m100205c(m95019U3);
            if (m95019U3.length() == 0 && c17945a0.m95275v4() != null) {
                m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_reply);
            } else if (c17945a0.m95239r4() != null && c17945a0.m95239r4().f91139a == 1) {
                String str2 = c17945a0.m95239r4().f91140b;
                AbstractC19074t.m100207e(str2, "data");
                if (str2.length() > 0) {
                    m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.noti_ref_text) + " " + m95019U3;
                }
            }
            AbstractC19074t.m100205c(m95019U3);
        } else {
            AbstractC19074t.m100205c(m95019U3);
        }
        return m95019U3;
    }

    /* renamed from: b */
    private static final String m102682b(C17945a0 c17945a0) {
        C17969i0 m94929K2 = c17945a0.m94929K2();
        AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentECard");
        String str = ((C17984n0) m94929K2).f91083F;
        C17969i0 m94929K22 = c17945a0.m94929K2();
        AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentECard");
        String str2 = ((C17984n0) m94929K22).f91079B;
        AbstractC19074t.m100205c(str);
        if (str.length() <= 0) {
            if (c17945a0.m95217o6()) {
                AbstractC19074t.m100205c(str2);
                if (str2.length() > 0) {
                    return AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_ecard) + " " + str2;
                }
            }
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_ecard);
            AbstractC19074t.m100205c(m118743r0);
            return m118743r0;
        }
        return str;
    }

    /* renamed from: c */
    private static final String m102683c(C17945a0 c17945a0) {
        if (c17945a0.m94929K2() != null && (c17945a0.m94929K2() instanceof C17990p0)) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
            if (((C17990p0) m94929K2).m95670k()) {
                if (c17945a0.m94929K2().f91011p.length() > 0) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_folder);
                    C17969i0 m94929K22 = c17945a0.m94929K2();
                    AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
                    return m118743r0 + " " + ((C17990p0) m94929K22).m95667h();
                }
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_folder);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                return m118743r02;
            }
        }
        if (c17945a0.m94929K2().f91011p.length() > 0) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_file) + " " + c17945a0.m94929K2().f91011p;
        }
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_file);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        return m118743r03;
    }

    /* renamed from: d */
    private static final String m102684d(C17945a0 c17945a0) {
        String str = c17945a0.m94929K2().f91011p;
        if (str.length() == 0) {
            String str2 = c17945a0.m94929K2().f91015t;
            if (str2.length() == 0) {
                str2 = "";
            }
            str = str2;
        }
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_location);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{str}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: e */
    private static final String m102685e(C17945a0 c17945a0) {
        String str;
        String str2;
        String str3 = "";
        if (c17945a0.m94995R6() && c17945a0.m94929K2() != null) {
            String str4 = c17945a0.m94929K2().f91011p;
            List m40857g = c17945a0.m95011T3().m40857g();
            AbstractC19074t.m100205c(m40857g);
            if (!c17945a0.m94847A6()) {
                str2 = "";
            } else {
                str2 = c17945a0.mo95039W2();
            }
            AbstractC19074t.m100205c(str2);
            str = m102677N(m40857g, str4, str2, null, null, null, 56, null);
        } else {
            str = null;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_photo);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        try {
            if (c17945a0.m94929K2() != null) {
                String str5 = c17945a0.m94929K2().f91017v;
                if (str5.length() > 0) {
                    String optString = new JSONObject(str5).getJSONObject("webp").optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, "");
                    AbstractC19074t.m100205c(optString);
                    if (optString.length() > 0) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_sticker);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    }
                }
            }
        } catch (JSONException unused) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_photo);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
        }
        if (str != null && str.length() != 0) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{str}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
        C19067n0 c19067n02 = C19067n0.f94947a;
        Object[] objArr = new Object[1];
        String str6 = c17945a0.m94929K2().f91011p;
        if (str6.length() != 0) {
            str3 = str6;
        }
        objArr[0] = str3;
        String format2 = String.format(m118743r0, Arrays.copyOf(objArr, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        return format2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0117, code lost:            r0 = fn0.C19067n0.f94947a;        r0 = me0.AbstractC23136l9.m118743r0(com.zing.zalo.AbstractC8020f0.str_type_msg_contact);        fn0.AbstractC19074t.m100207e(r0, "getString(...)");        r6 = java.lang.String.format(r0, java.util.Arrays.copyOf(new java.lang.Object[]{r6.m94929K2().f91011p}, 1));        fn0.AbstractC19074t.m100207e(r6, "format(...)");     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0137, code lost:            return r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:            if (r0.equals("recommened.vip") == false) goto L94;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:            if (r0.equals("recommened.user") == false) goto L94;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String m102686f(C17945a0 c17945a0) {
        C18013y0 c18013y0;
        String m118743r0;
        String str = c17945a0.m94929K2().f91016u;
        switch (str.hashCode()) {
            case -999310090:
                break;
            case -914139583:
                if (str.equals("recommened.link")) {
                    String str2 = c17945a0.m94929K2().f91011p;
                    C17969i0 m94929K2 = c17945a0.m94929K2();
                    C32098s c32098s = null;
                    if (m94929K2 instanceof C18013y0) {
                        c18013y0 = (C18013y0) m94929K2;
                    } else {
                        c18013y0 = null;
                    }
                    if (c18013y0 != null) {
                        c32098s = c18013y0.f91251B;
                    }
                    if (str2.length() == 0) {
                        C17969i0 m94929K22 = c17945a0.m94929K2();
                        AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentRecommend");
                        if (((C18013y0) m94929K22).f91251B != null) {
                            C17969i0 m94929K23 = c17945a0.m94929K2();
                            AbstractC19074t.m100206d(m94929K23, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentRecommend");
                            str2 = ((C18013y0) m94929K23).f91251B.f147953c;
                            AbstractC19074t.m100207e(str2, "mMediaTitle");
                        }
                    }
                    if (c32098s != null && c32098s.m154942l()) {
                        String str3 = c32098s.f147953c;
                        if (str3.length() == 0) {
                            str3 = c17945a0.m94929K2().f91011p;
                        }
                        if (str3.length() == 0) {
                            return "[" + AbstractC23136l9.m118743r0(AbstractC8020f0.zalo_video) + "]";
                        }
                        return "[" + AbstractC23136l9.m118743r0(AbstractC8020f0.zalo_video) + "] " + str3;
                    }
                    if (str2.length() > 0) {
                        m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_type_msg_link, str2);
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_recommend_link_default);
                    }
                    AbstractC19074t.m100205c(m118743r0);
                    return m118743r0;
                }
                break;
            case -913862126:
                break;
            case 1012294412:
                if (str.equals("recommened.stickerset")) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_sticker_set);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    String format = String.format(m118743r02, Arrays.copyOf(new Object[]{c17945a0.m94929K2().f91011p}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    return format;
                }
                break;
        }
        String m95019U3 = c17945a0.m95019U3();
        AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
        return m95019U3;
    }

    /* renamed from: g */
    private static final String m102687g(C17945a0 c17945a0) {
        String str = "";
        if (c17945a0.m95288w8()) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_gif_with_caption);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            Object[] objArr = new Object[1];
            String str2 = c17945a0.m94929K2().f91011p;
            if (str2.length() != 0) {
                str = str2;
            }
            objArr[0] = str;
            String format = String.format(m118743r0, Arrays.copyOf(objArr, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
        C19067n0 c19067n02 = C19067n0.f94947a;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_video);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        Object[] objArr2 = new Object[1];
        String str3 = c17945a0.m94929K2().f91011p;
        if (str3.length() != 0) {
            str = str3;
        }
        objArr2[0] = str;
        String format2 = String.format(m118743r02, Arrays.copyOf(objArr2, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        return format2;
    }

    /* renamed from: h */
    public static final String m102688h(String str) {
        int m127173b0;
        int indexOf;
        AbstractC19074t.m100208f(str, "str");
        m127173b0 = AbstractC24342w.m127173b0(str, "%", 0, false, 6, null);
        if (m127173b0 == -1) {
            return str;
        }
        Pattern compile = Pattern.compile("%(\\d+)\\$s");
        StringBuilder sb2 = new StringBuilder(str);
        while (m127173b0 >= 0) {
            Matcher matcher = compile.matcher(sb2.substring(m127173b0));
            if (matcher.find() && matcher.start() == 0) {
                indexOf = sb2.indexOf("%", m127173b0 + 1);
            } else {
                sb2.insert(m127173b0, '%');
                indexOf = sb2.indexOf("%", m127173b0 + 2);
            }
            m127173b0 = indexOf;
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: i */
    public static final C7907e m102689i(C7907e c7907e, String str) {
        AbstractC19074t.m100208f(c7907e, "mentions");
        AbstractC19074t.m100208f(str, "currentChatUid");
        C7907e c7907e2 = new C7907e();
        C32076q5 m4476k = C0943w.f3447a.m4476k(str);
        int m40861l = c7907e.m40861l();
        for (int i11 = 0; i11 < m40861l; i11++) {
            C7907e.a m40855e = c7907e.m40855e(i11);
            if (m40855e.f42791a == 1 || (m4476k != null && m4476k.m154722k(String.valueOf(m40855e.f42792b)))) {
                c7907e2.m40852b(m40855e);
            }
        }
        return c7907e2;
    }

    /* renamed from: j */
    public static final SpannableString m102690j(CharSequence charSequence, String str, ContactProfile contactProfile, String str2, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(str, "groupDpn");
        AbstractC19074t.m100208f(contactProfile, "sender");
        AbstractC19074t.m100208f(str2, "groupId");
        if (z11) {
            i11 = AbstractC8020f0.str_prefix_community_dpn;
        } else {
            i11 = AbstractC8020f0.str_prefix_group_dpn;
        }
        String str3 = AbstractC23136l9.m118743r0(i11) + str;
        String m40383Q = contactProfile.m40383Q(true, false);
        if (str2.length() > 0) {
            m40383Q = AbstractC23184q2.m119453k(contactProfile.f42434r, m40383Q, str2);
        }
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("%1$s\n%2$s: %3$s", Arrays.copyOf(new Object[]{str3, m40383Q, charSequence}, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new StyleSpan(1), 0, str3.length() + 1 + m40383Q.length() + 1, 17);
        return spannableString;
    }

    /* renamed from: k */
    public static final SpannableString m102691k(CharSequence charSequence, ContactProfile contactProfile) {
        AbstractC19074t.m100208f(charSequence, "message");
        AbstractC19074t.m100208f(contactProfile, "sender");
        String m40383Q = contactProfile.m40383Q(true, false);
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("%1$s: %2$s", Arrays.copyOf(new Object[]{m40383Q, charSequence}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new StyleSpan(1), 0, m40383Q.length() + 1, 17);
        return spannableString;
    }

    /* renamed from: l */
    public static final String m102692l(ContactProfile contactProfile, String str) {
        AbstractC19074t.m100208f(contactProfile, "favFriend");
        String m114539f = AbstractC21935u.m114539f(contactProfile.f42455y, str, contactProfile.f42437s);
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_info_add_favorite_friend);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m114539f, m114539f}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: m */
    public static final String m102693m(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "contactToInsert");
        String m40383Q = contactProfile.m40383Q(true, false);
        if (m40383Q != null && m40383Q.length() != 0) {
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_added_x_to_block_list, contactProfile.m40383Q(true, false));
            AbstractC19074t.m100205c(m118746s0);
            return m118746s0;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list);
        AbstractC19074t.m100205c(m118743r0);
        return m118743r0;
    }

    /* renamed from: n */
    public static final CharSequence m102694n(ContactProfile contactProfile, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(contactProfile, "contact");
        AbstractC19074t.m100208f(c17945a0, "msg");
        CharSequence m102679P = m102679P(m102680Q(m102695o(c17945a0), contactProfile, c17945a0), c17945a0);
        String m95130f4 = c17945a0.m95130f4();
        AbstractC19074t.m100207e(m95130f4, "getNotifyText(...)");
        if (m95130f4.length() > 0) {
            String m95130f42 = c17945a0.m95130f4();
            AbstractC19074t.m100207e(m95130f42, "getNotifyText(...)");
            return m95130f42;
        }
        return m102679P;
    }

    /* renamed from: o */
    private static final CharSequence m102695o(C17945a0 c17945a0) {
        if (c17945a0.m94941L6()) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_live_location_v2);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        if (c17945a0.m95306y8()) {
            return m102687g(c17945a0);
        }
        if (!c17945a0.m94871D7() && !c17945a0.m94890F7()) {
            if (c17945a0.m95110d8()) {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_sticker);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                return m118743r02;
            }
            if (c17945a0.m95015T7()) {
                String str = c17945a0.m94929K2().f91011p;
                if (str.length() == 0) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_link);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    String format = String.format(m118743r03, Arrays.copyOf(new Object[]{""}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    return format;
                }
                return str;
            }
            if (c17945a0.m95120e6()) {
                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_doodle);
                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                return m118743r04;
            }
            if (c17945a0.m95316z8()) {
                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_voice);
                AbstractC19074t.m100207e(m118743r05, "getString(...)");
                return m118743r05;
            }
            if (c17945a0.m95276v6()) {
                return m102683c(c17945a0);
            }
            if (c17945a0.m94949M6()) {
                return m102684d(c17945a0);
            }
            if (!c17945a0.m95226p6() && !c17945a0.m95217o6()) {
                if (c17945a0.m95314z6()) {
                    String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_gif);
                    AbstractC19074t.m100207e(m118743r06, "getString(...)");
                    return m118743r06;
                }
                if (c17945a0.m95298x8()) {
                    String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_livestream);
                    AbstractC19074t.m100207e(m118743r07, "getString(...)");
                    return m118743r07;
                }
                if (c17945a0.m95031V5()) {
                    String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.chat_theme_changed_by_me);
                    AbstractC19074t.m100207e(m118743r08, "getString(...)");
                    return m118743r08;
                }
                if (c17945a0.m94977P7()) {
                    return m102686f(c17945a0);
                }
                return m102681a(c17945a0);
            }
            return m102682b(c17945a0);
        }
        return m102685e(c17945a0);
    }

    /* renamed from: p */
    public static final String m102696p(Conversation conversation, EnumC18030a enumC18030a) {
        int i11;
        int i12;
        String str = "";
        if (conversation == null) {
            return "";
        }
        String m40990d = Conversation.m40990d(conversation, true, false, false, 4, null);
        if (m40990d != null) {
            str = m40990d;
        }
        if (enumC18030a == null) {
            i11 = -1;
        } else {
            i11 = a.f97424a[enumC18030a.ordinal()];
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                if (conversation.m41012p()) {
                    i12 = AbstractC8020f0.str_prefix_community_dpn;
                } else {
                    i12 = AbstractC8020f0.str_prefix_group_dpn;
                }
                return AbstractC23136l9.m118743r0(i12) + str;
            }
            throw new IllegalArgumentException("generateChatOwnerName(): Invalid chat mode");
        }
        return str;
    }

    /* renamed from: q */
    public static final String m102697q(C31973j5 c31973j5) {
        String str;
        int i11;
        AbstractC19074t.m100208f(c31973j5, "group");
        if (c31973j5.m153747Y()) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_community) + " • ";
        } else {
            str = "";
        }
        C19067n0 c19067n0 = C19067n0.f94947a;
        if (c31973j5.m153732O() > 1) {
            i11 = AbstractC8020f0.str_chat_info_num_member_groups;
        } else {
            i11 = AbstractC8020f0.str_chat_info_num_member_group;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(c31973j5.m153732O())}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        return str + format;
    }

    /* renamed from: r */
    public static final String m102698r(int i11) {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message_with_code);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: s */
    public static final String m102699s(int i11) {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_undo_friend_request);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: t */
    public static final String m102700t(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        String m95130f4 = c17945a0.m95130f4();
        AbstractC19074t.m100207e(m95130f4, "getNotifyText(...)");
        if (m95130f4.length() > 0) {
            String m95130f42 = c17945a0.m95130f4();
            AbstractC19074t.m100207e(m95130f42, "getNotifyText(...)");
            return m95130f42;
        }
        return m102703w(c17945a0);
    }

    /* renamed from: u */
    public static final String m102701u(long j11) {
        if (j11 == -1) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_msg_turn_off_notif);
            AbstractC19074t.m100205c(m118743r0);
            return m118743r0;
        }
        if (j11 == 3600000) {
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_msg_turn_off_notif_for_1_hour);
            AbstractC19074t.m100205c(m118743r02);
            return m118743r02;
        }
        if (j11 == 14400000) {
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_msg_turn_off_notif_for_4_hour);
            AbstractC19074t.m100205c(m118743r03);
            return m118743r03;
        }
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_msg_turn_off_notif_util_morning);
        AbstractC19074t.m100205c(m118743r04);
        return m118743r04;
    }

    /* renamed from: v */
    public static final String m102702v(C24275a c24275a, boolean z11) {
        String format;
        String str;
        AbstractC19074t.m100208f(c24275a, "alarmItem");
        if (c24275a.m126772i()) {
            if (z11) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.mute_info_banner_permanent);
            } else {
                str = "";
            }
            AbstractC19074t.m100205c(str);
            return str;
        }
        long m126767d = c24275a.m126767d();
        if (c24275a.m126773j()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(m126767d);
            if (calendar.get(12) == 59) {
                long j11 = 60000;
                m126767d = (m126767d + j11) - (m126767d % j11);
            }
        }
        if (z11) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.mute_info_banner);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            format = String.format(m118743r0, Arrays.copyOf(new Object[]{AbstractC23160o0.m119248f(m126767d)}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
        } else {
            C19067n0 c19067n02 = C19067n0.f94947a;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mute_info_sub_text);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            format = String.format(m118743r02, Arrays.copyOf(new Object[]{AbstractC23160o0.m119248f(m126767d)}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
        }
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:252:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m102703w(C17945a0 c17945a0) {
        int i11;
        boolean z11;
        int m95041W4;
        int i12;
        C18013y0 c18013y0;
        C32098s c32098s;
        String m118743r0;
        String str;
        String str2;
        C18013y0 c18013y02;
        String m95606h;
        String m94854B4;
        String format;
        String str3;
        String str4;
        AbstractC19074t.m100208f(c17945a0, "msg");
        boolean z12 = false;
        if (c17945a0.m95228p8()) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format2 = String.format(Locale.US, "[%s]", Arrays.copyOf(new Object[]{AbstractC23136l9.m118743r0(AbstractC8020f0.str_bubble_unsupport_message)}, 1));
            AbstractC19074t.m100207e(format2, "format(...)");
            return format2;
        }
        if (!c17945a0.m95219o8() && !c17945a0.m95091b6()) {
            String m95206n4 = c17945a0.m95206n4();
            if (m95206n4 != null && m95206n4.length() != 0) {
                String m95206n42 = c17945a0.m95206n4();
                AbstractC19074t.m100207e(m95206n42, "getPreviewText(...)");
                return m95206n42;
            }
            String m95019U3 = c17945a0.m95019U3();
            String str5 = "";
            if (c17945a0.m95011T3() != null && c17945a0.m95011T3().m40861l() > 0) {
                List m40857g = c17945a0.m95011T3().m40857g();
                if (c17945a0.m95208n8()) {
                    String m95019U32 = c17945a0.m95019U3();
                    AbstractC19074t.m100207e(m95019U32, "getMessage(...)");
                    if (m95019U32.length() > 0) {
                        AbstractC19074t.m100205c(m40857g);
                        String m95019U33 = c17945a0.m95019U3();
                        AbstractC19074t.m100207e(m95019U33, "getMessage(...)");
                        if (!c17945a0.m94847A6()) {
                            str4 = "";
                        } else {
                            str4 = c17945a0.mo95039W2();
                        }
                        AbstractC19074t.m100205c(str4);
                        m95019U3 = m102677N(m40857g, m95019U33, str4, null, null, null, 56, null);
                        z11 = true;
                    }
                } else if ((c17945a0.m94871D7() || c17945a0.m94890F7() || c17945a0.m94977P7()) && c17945a0.m94929K2().f91011p.length() > 0) {
                    AbstractC19074t.m100205c(m40857g);
                    String str6 = c17945a0.m94929K2().f91011p;
                    if (!c17945a0.m94847A6()) {
                        str3 = "";
                    } else {
                        str3 = c17945a0.mo95039W2();
                    }
                    AbstractC19074t.m100205c(str3);
                    m95019U3 = m102677N(m40857g, str6, str3, null, null, null, 56, null);
                    z11 = true;
                }
                m95041W4 = c17945a0.m95041W4();
                if (m95041W4 == 0) {
                    if (m95041W4 != 6) {
                        if (m95041W4 != 10) {
                            String str7 = null;
                            r13 = null;
                            C17970i1 c17970i1 = null;
                            String str8 = null;
                            String m114542i = null;
                            if (m95041W4 != 12) {
                                if (m95041W4 != 15) {
                                    if (m95041W4 != 29) {
                                        if (m95041W4 != 34) {
                                            if (m95041W4 != 45) {
                                                if (m95041W4 != 100) {
                                                    if (m95041W4 != 2) {
                                                        if (m95041W4 != 3 && m95041W4 != 4) {
                                                            if (m95041W4 != 31) {
                                                                if (m95041W4 != 32) {
                                                                    switch (m95041W4) {
                                                                        case 18:
                                                                            String str9 = c17945a0.m94929K2().f91011p;
                                                                            if (str9.length() == 0) {
                                                                                str9 = c17945a0.m94929K2().f91015t;
                                                                            }
                                                                            C19067n0 c19067n02 = C19067n0.f94947a;
                                                                            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_location);
                                                                            AbstractC19074t.m100207e(m118743r02, "getString(...)");
                                                                            m95019U3 = String.format(m118743r02, Arrays.copyOf(new Object[]{str9}, 1));
                                                                            AbstractC19074t.m100207e(m95019U3, "format(...)");
                                                                            break;
                                                                        case 19:
                                                                            if (c17945a0.m95288w8()) {
                                                                                C19067n0 c19067n03 = C19067n0.f94947a;
                                                                                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_gif_with_caption);
                                                                                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                                                                                format = String.format(m118743r03, Arrays.copyOf(new Object[]{c17945a0.m94929K2().f91011p}, 1));
                                                                                AbstractC19074t.m100207e(format, "format(...)");
                                                                                break;
                                                                            } else {
                                                                                C19067n0 c19067n04 = C19067n0.f94947a;
                                                                                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_video);
                                                                                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                                                                                format = String.format(m118743r04, Arrays.copyOf(new Object[]{c17945a0.m94929K2().f91011p}, 1));
                                                                                AbstractC19074t.m100207e(format, "format(...)");
                                                                                break;
                                                                            }
                                                                        case 20:
                                                                            if (c17945a0.m94929K2() instanceof C18005u0) {
                                                                                C17969i0 m94929K2 = c17945a0.m94929K2();
                                                                                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentMsgInfo");
                                                                                C7907e c7907e = ((C18005u0) m94929K2).f91201C;
                                                                                if (c7907e != null) {
                                                                                    List m40857g2 = c7907e.m40857g();
                                                                                    AbstractC19074t.m100205c(m40857g2);
                                                                                    String m95019U34 = c17945a0.m95019U3();
                                                                                    AbstractC19074t.m100207e(m95019U34, "getMessage(...)");
                                                                                    if (c17945a0.m94847A6()) {
                                                                                        str5 = c17945a0.mo95039W2();
                                                                                    }
                                                                                    AbstractC19074t.m100205c(str5);
                                                                                    m95019U3 = m102678O(m40857g2, m95019U34, str5);
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 21:
                                                                            m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_ecard);
                                                                            if (c17945a0.m94929K2() instanceof C17984n0) {
                                                                                C17969i0 m94929K22 = c17945a0.m94929K2();
                                                                                AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentECard");
                                                                                C17984n0 c17984n0 = (C17984n0) m94929K22;
                                                                                C7907e c7907e2 = c17984n0.f91086I;
                                                                                if (c7907e2 != null) {
                                                                                    List m40857g3 = c7907e2.m40857g();
                                                                                    AbstractC19074t.m100205c(m40857g3);
                                                                                    String str10 = c17984n0.f91083F;
                                                                                    AbstractC19074t.m100207e(str10, "previewTxt");
                                                                                    if (c17945a0.m94847A6()) {
                                                                                        str5 = c17945a0.mo95039W2();
                                                                                    }
                                                                                    AbstractC19074t.m100205c(str5);
                                                                                    m95019U3 = m102678O(m40857g3, str10, str5);
                                                                                    break;
                                                                                } else {
                                                                                    String str11 = c17984n0.f91083F;
                                                                                    AbstractC19074t.m100207e(str11, "previewTxt");
                                                                                    if (str11.length() > 0) {
                                                                                        m95019U3 = c17984n0.f91083F;
                                                                                        break;
                                                                                    } else if (c17945a0.m94932K6()) {
                                                                                        String str12 = c17984n0.f91079B;
                                                                                        AbstractC19074t.m100207e(str12, "mHeader");
                                                                                        if (str12.length() > 0) {
                                                                                            m95019U3 = m95019U3 + " " + c17984n0.f91079B;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 22:
                                                                            if (c17945a0.m94929K2() instanceof C17990p0) {
                                                                                C17969i0 m94929K23 = c17945a0.m94929K2();
                                                                                AbstractC19074t.m100206d(m94929K23, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentFile");
                                                                                C17990p0 c17990p0 = (C17990p0) m94929K23;
                                                                                if (c17990p0.m95670k()) {
                                                                                    m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_folder);
                                                                                    if (c17990p0.f91011p.length() > 0) {
                                                                                        m95019U3 = m95019U3 + " " + c17990p0.m95667h();
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_file);
                                                                                    if (c17990p0.f91011p.length() > 0) {
                                                                                        m95019U3 = m95019U3 + " " + c17990p0.f91011p;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 23:
                                                                            m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_gif);
                                                                            break;
                                                                        case 24:
                                                                            if (c17945a0.m94929K2() instanceof C17967h1) {
                                                                                C17969i0 m94929K24 = c17945a0.m94929K2();
                                                                                AbstractC19074t.m100206d(m94929K24, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentZinstant");
                                                                                String m95579j = ((C17967h1) m94929K24).m95579j();
                                                                                if (m95579j != null && m95579j.length() != 0) {
                                                                                    C17969i0 m94929K25 = c17945a0.m94929K2();
                                                                                    AbstractC19074t.m100206d(m94929K25, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentZinstant");
                                                                                    m95019U3 = ((C17967h1) m94929K25).m95579j();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 25:
                                                                            m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_livestream);
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_live_location_v2);
                                                                }
                                                            }
                                                        } else {
                                                            if (z11) {
                                                                AbstractC19074t.m100205c(m95019U3);
                                                                if (m95019U3.length() > 0) {
                                                                    C19067n0 c19067n05 = C19067n0.f94947a;
                                                                    String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_photo);
                                                                    AbstractC19074t.m100207e(m118743r05, "getString(...)");
                                                                    format = String.format(m118743r05, Arrays.copyOf(new Object[]{m95019U3}, 1));
                                                                    AbstractC19074t.m100207e(format, "format(...)");
                                                                }
                                                            }
                                                            C19067n0 c19067n06 = C19067n0.f94947a;
                                                            String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_photo);
                                                            AbstractC19074t.m100207e(m118743r06, "getString(...)");
                                                            format = String.format(m118743r06, Arrays.copyOf(new Object[]{c17945a0.m94929K2().f91011p}, 1));
                                                            AbstractC19074t.m100207e(format, "format(...)");
                                                        }
                                                        m95019U3 = format;
                                                    } else {
                                                        m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_doodle);
                                                    }
                                                } else if (c17945a0.m94929K2() instanceof C17972j0) {
                                                    m95019U3 = "[" + AbstractC23136l9.m118743r0(AbstractC8020f0.str_bank_card_preview_text) + "]";
                                                }
                                            } else if (c17945a0.m94929K2() instanceof C17946a1) {
                                                C17969i0 m94929K26 = c17945a0.m94929K2();
                                                AbstractC19074t.m100206d(m94929K26, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentSectionDivider");
                                                m95019U3 = ((C17946a1) m94929K26).m95394g();
                                            }
                                        } else if (c17945a0.m95205n3() != null) {
                                            String str13 = c17945a0.m95205n3().m14322a0().f12050d0;
                                            AbstractC19074t.m100207e(str13, "previewTxt");
                                            if (str13.length() > 0) {
                                                m95019U3 = c17945a0.m95205n3().m14322a0().f12050d0;
                                            }
                                        }
                                    } else if (c17945a0.m95032V6()) {
                                        m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.chat_theme_changed_by_me);
                                    } else {
                                        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, c17945a0.m94862C4(), null, 2, null);
                                        if (m141798e != null && !TextUtils.isEmpty(m141798e.f42437s)) {
                                            m94854B4 = m141798e.m40383Q(true, false);
                                            if (!TextUtils.isEmpty(m94854B4)) {
                                                AbstractC19074t.m100205c(m94854B4);
                                            } else {
                                                m94854B4 = m141798e.f42437s;
                                                AbstractC19074t.m100207e(m94854B4, "dpn");
                                            }
                                        } else {
                                            m94854B4 = c17945a0.m94854B4();
                                            AbstractC19074t.m100207e(m94854B4, "getSenderName(...)");
                                        }
                                        m95019U3 = AbstractC23136l9.m118746s0(AbstractC8020f0.chat_theme_changed_by_friend, m94854B4);
                                    }
                                } else {
                                    C17970i1 m95285w4 = c17945a0.m95285w4();
                                    if (m95285w4 == null) {
                                        ArrayList m94922J3 = c17945a0.m94922J3();
                                        if (m94922J3 != null) {
                                            if (m94922J3.size() <= 0) {
                                                m94922J3 = null;
                                            }
                                            if (m94922J3 != null) {
                                                c17970i1 = (C17970i1) m94922J3.get(0);
                                            }
                                        }
                                    } else {
                                        c17970i1 = m95285w4;
                                    }
                                    if (c17970i1 != null && (m95606h = c17970i1.m95606h()) != null) {
                                        if (m95606h.length() == 0) {
                                            C19067n0 c19067n07 = C19067n0.f94947a;
                                            String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_link);
                                            AbstractC19074t.m100207e(m118743r07, "getString(...)");
                                            m95606h = String.format(m118743r07, Arrays.copyOf(new Object[]{""}, 1));
                                            AbstractC19074t.m100207e(m95606h, "format(...)");
                                        }
                                        if (m95606h != null) {
                                            str5 = m95606h;
                                        }
                                    }
                                    m95019U3 = str5;
                                }
                            } else {
                                String str14 = c17945a0.m94929K2().f91016u;
                                switch (str14.hashCode()) {
                                    case -2138772447:
                                        if (str14.equals("recommened.misscall")) {
                                            m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_missCall);
                                            break;
                                        }
                                        break;
                                    case -1103456014:
                                        if (str14.equals("recommened.calltime")) {
                                            if (c17945a0.m95032V6()) {
                                                i12 = AbstractC8020f0.str_msg_has_called;
                                            } else {
                                                i12 = AbstractC8020f0.str_msg_has_received_call;
                                            }
                                            m95019U3 = AbstractC23136l9.m118743r0(i12);
                                            break;
                                        }
                                        break;
                                    case -999310090:
                                        if (str14.equals("recommened.vip")) {
                                            C19067n0 c19067n08 = C19067n0.f94947a;
                                            String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_contact);
                                            AbstractC19074t.m100207e(m118743r08, "getString(...)");
                                            m95019U3 = String.format(m118743r08, Arrays.copyOf(new Object[]{c17945a0.m94929K2().f91011p}, 1));
                                            AbstractC19074t.m100207e(m95019U3, "format(...)");
                                            break;
                                        }
                                        break;
                                    case -914296263:
                                        if (str14.equals("recommened.game")) {
                                            m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_recommend_game_set);
                                            break;
                                        }
                                        break;
                                    case -914139583:
                                        if (str14.equals("recommened.link")) {
                                            C17969i0 m94929K27 = c17945a0.m94929K2();
                                            if (m94929K27 instanceof C18013y0) {
                                                c18013y0 = (C18013y0) m94929K27;
                                            } else {
                                                c18013y0 = null;
                                            }
                                            if (c18013y0 != null) {
                                                c32098s = c18013y0.f91251B;
                                            } else {
                                                c32098s = null;
                                            }
                                            if (c32098s != null && c32098s.m154942l()) {
                                                z12 = true;
                                            }
                                            if (z12) {
                                                if (c32098s != null) {
                                                    str2 = c32098s.m154933c();
                                                } else {
                                                    str2 = null;
                                                }
                                                if (str2 == null) {
                                                    str2 = "";
                                                }
                                                if (str2.length() == 0) {
                                                    str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.zalo_video);
                                                    AbstractC19074t.m100207e(str2, "getString(...)");
                                                }
                                                m118743r0 = "[" + str2 + "]";
                                            } else {
                                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_recommend_link_default);
                                                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                                            }
                                            if (z11) {
                                                AbstractC19074t.m100205c(m95019U3);
                                                if (m95019U3.length() > 0) {
                                                    AbstractC19074t.m100205c(m95019U3);
                                                    str5 = m95019U3;
                                                    m95019U3 = m118743r0 + " " + str5;
                                                    break;
                                                }
                                            }
                                            if (z12) {
                                                if (c32098s != null) {
                                                    str = c32098s.f147953c;
                                                } else {
                                                    str = null;
                                                }
                                                if (str != null && str.length() != 0) {
                                                    if (c32098s != null) {
                                                        str7 = c32098s.f147953c;
                                                    }
                                                    if (str7 != null) {
                                                        str5 = str7;
                                                    }
                                                    m95019U3 = m118743r0 + " " + str5;
                                                }
                                            }
                                            if (c17945a0.m94929K2().f91011p.length() > 0) {
                                                str5 = c17945a0.m94929K2().f91011p;
                                            } else if (c32098s != null) {
                                                str5 = c32098s.f147953c;
                                                AbstractC19074t.m100207e(str5, "mMediaTitle");
                                            }
                                            m95019U3 = m118743r0 + " " + str5;
                                        }
                                        break;
                                    case -913862126:
                                        if (str14.equals("recommened.user")) {
                                            try {
                                                C17969i0 m94929K28 = c17945a0.m94929K2();
                                                if (m94929K28 instanceof C18013y0) {
                                                    c18013y02 = (C18013y0) m94929K28;
                                                } else {
                                                    c18013y02 = null;
                                                }
                                                if (c18013y02 != null) {
                                                    C17978l0 c17978l0 = c18013y02.f91253D;
                                                    if (c17978l0 != null) {
                                                        str8 = c17978l0.f91053a;
                                                    }
                                                    m114542i = AbstractC21935u.m114539f(AbstractC23056e6.m118285k(str8), c17945a0.m94929K2().f91017v, c17945a0.m94929K2().f91011p);
                                                }
                                            } catch (Exception e11) {
                                                AbstractC23350e.m122776f("MessageTextUtils", e11);
                                                m114542i = AbstractC21935u.m114542i(c17945a0.m94929K2().f91017v, c17945a0.m94929K2().f91011p);
                                            }
                                            C19067n0 c19067n09 = C19067n0.f94947a;
                                            String m118743r09 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_contact);
                                            AbstractC19074t.m100207e(m118743r09, "getString(...)");
                                            m95019U3 = String.format(m118743r09, Arrays.copyOf(new Object[]{m114542i}, 1));
                                            AbstractC19074t.m100207e(m95019U3, "format(...)");
                                            break;
                                        }
                                        break;
                                    case -302954634:
                                        if (str14.equals("recommened.groupcall")) {
                                            m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_gc_info_ongoing_status);
                                            break;
                                        }
                                        break;
                                    case 1012294412:
                                        if (str14.equals("recommened.stickerset")) {
                                            C19067n0 c19067n010 = C19067n0.f94947a;
                                            String m118743r010 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_sticker_set);
                                            AbstractC19074t.m100207e(m118743r010, "getString(...)");
                                            m95019U3 = String.format(m118743r010, Arrays.copyOf(new Object[]{c17945a0.m94929K2().f91011p}, 1));
                                            AbstractC19074t.m100207e(m95019U3, "format(...)");
                                            break;
                                        }
                                        break;
                                    case 2034143494:
                                        if (str14.equals("recommened.msg.game")) {
                                            m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_recommend_game_set);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                        m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_sticker);
                    } else {
                        m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_voice);
                    }
                } else {
                    AbstractC19074t.m100205c(m95019U3);
                    if (m95019U3.length() == 0 && c17945a0.m95275v4() != null) {
                        m95019U3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_type_msg_reply);
                    }
                }
                AbstractC19074t.m100205c(m95019U3);
                return m95019U3;
            }
            if (c17945a0.m94871D7() || c17945a0.m94890F7() || c17945a0.m94977P7()) {
                m95019U3 = "";
            }
            z11 = false;
            m95041W4 = c17945a0.m95041W4();
            if (m95041W4 == 0) {
            }
            AbstractC19074t.m100205c(m95019U3);
            return m95019U3;
        }
        if (c17945a0.m94929K2() instanceof C17958e1) {
            C17969i0 m94929K29 = c17945a0.m94929K2();
            AbstractC19074t.m100206d(m94929K29, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentUndo");
            return ((C17958e1) m94929K29).m95420i();
        }
        if (c17945a0.m95219o8()) {
            i11 = AbstractC8020f0.str_bubble_undo_sent_message;
        } else {
            i11 = AbstractC8020f0.str_bubble_delete_message;
        }
        String m118743r011 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100205c(m118743r011);
        return m118743r011;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0085. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C19660u0 m102704x(C17997r1 c17997r1, String str) {
        String m95692i;
        String str2;
        String string;
        String str3;
        C7907e c7907e;
        String string2;
        String string3;
        int i11;
        ContactProfile m98552o;
        String str4;
        AbstractC19074t.m100208f(c17997r1, "reply");
        String str5 = null;
        if (AbstractC19074t.m100204b(c17997r1.m95693j(), CoreUtility.f89233i)) {
            m95692i = AbstractC23304d.f113368c0.f42437s;
            AbstractC19074t.m100205c(m95692i);
        } else {
            ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, c17997r1.m95693j(), false, 2, null);
            if (m141800i != null) {
                m95692i = m141800i.m40383Q(true, false);
            } else {
                m95692i = c17997r1.m95692i();
            }
            AbstractC19074t.m100205c(m95692i);
        }
        String str6 = "";
        if (str == null || !AbstractC25495a.m132079d(str)) {
            str2 = "";
        } else {
            str2 = str;
        }
        String m119453k = AbstractC23184q2.m119453k(c17997r1.m95693j(), m95692i, str2);
        AbstractC19074t.m100207e(m119453k, "getNicknameInGroup(...)");
        Context m35500c = MainApplication.Companion.m35500c();
        C17969i0 m95690g = c17997r1.m95690g();
        int m95687d = c17997r1.m95687d();
        if (m95687d != -1) {
            if (m95687d != 1 && m95687d != 41) {
                if (m95687d != 49) {
                    if (m95687d != 52) {
                        if (m95687d != 56 && m95687d != 59) {
                            if (m95687d != 31) {
                                if (m95687d != 32) {
                                    switch (m95687d) {
                                        case 36:
                                            string2 = m35500c.getString(AbstractC8020f0.str_reply_msg_sticker);
                                            AbstractC19074t.m100207e(string2, "getString(...)");
                                            break;
                                        case 37:
                                            string2 = m35500c.getString(AbstractC8020f0.str_reply_msg_doodle);
                                            AbstractC19074t.m100207e(string2, "getString(...)");
                                            break;
                                        case 38:
                                            if (m95690g != null) {
                                                String str7 = m95690g.f91016u;
                                                if (TextUtils.equals("recommened.link", str7)) {
                                                    String string4 = m35500c.getString(AbstractC8020f0.str_reply_msg_link);
                                                    AbstractC19074t.m100207e(string4, "getString(...)");
                                                    if (m95690g instanceof C18013y0) {
                                                        C18013y0 c18013y0 = (C18013y0) m95690g;
                                                        C32098s c32098s = c18013y0.f91251B;
                                                        if (c32098s != null && c32098s.m154942l()) {
                                                            C32098s c32098s2 = c18013y0.f91251B;
                                                            if (c32098s2 != null) {
                                                                str5 = c32098s2.m154933c();
                                                            }
                                                            if (str5 == null) {
                                                                str5 = "";
                                                            }
                                                            if (str5.length() == 0) {
                                                                str5 = m35500c.getString(AbstractC8020f0.zalo_video);
                                                                AbstractC19074t.m100207e(str5, "getString(...)");
                                                            }
                                                            string4 = "[" + str5 + "]";
                                                        }
                                                        String str8 = m95690g.f91011p;
                                                        String m95796i = c18013y0.m95796i();
                                                        if (!TextUtils.isEmpty(str8)) {
                                                            str3 = str8;
                                                        } else if (!TextUtils.isEmpty(m95796i)) {
                                                            AbstractC19074t.m100205c(m95796i);
                                                            str3 = m95796i;
                                                        }
                                                        str6 = string4;
                                                        break;
                                                    }
                                                    str3 = "";
                                                    str6 = string4;
                                                } else if (TextUtils.equals("recommened.stickerset", str7)) {
                                                    string2 = m35500c.getString(AbstractC8020f0.str_reply_msg_sticker_set);
                                                    AbstractC19074t.m100207e(string2, "getString(...)");
                                                    break;
                                                } else if (TextUtils.equals("recommened.user", str7) || TextUtils.equals("recommened.vip", str7)) {
                                                    if (TextUtils.equals("recommened.vip", str7)) {
                                                        i11 = AbstractC8020f0.str_reply_msg_oa;
                                                    } else {
                                                        i11 = AbstractC8020f0.str_reply_msg_contact;
                                                    }
                                                    string2 = m35500c.getString(i11);
                                                    AbstractC19074t.m100207e(string2, "getString(...)");
                                                    String str9 = m95690g.f91011p;
                                                    String str10 = m95690g.f91017v;
                                                    if (!TextUtils.isEmpty(str10) && (m98552o = C18644n.m98531l().m98552o(str10)) != null && !str10.equals(CoreUtility.f89233i)) {
                                                        str9 = AbstractC21935u.m114539f(m98552o.f42455y, str10, str9);
                                                        AbstractC19074t.m100207e(str9, "convertNameUsePhoneOrId(...)");
                                                    }
                                                    if (!TextUtils.isEmpty(str9)) {
                                                        str6 = string2;
                                                        str3 = str9;
                                                        break;
                                                    }
                                                }
                                            }
                                            str3 = "";
                                            break;
                                        default:
                                            switch (m95687d) {
                                                case 43:
                                                    string2 = m35500c.getString(AbstractC8020f0.str_reply_msg_location);
                                                    AbstractC19074t.m100207e(string2, "getString(...)");
                                                    if (m95690g != null) {
                                                        if (!TextUtils.isEmpty(m95690g.f91011p)) {
                                                            str6 = m95690g.f91011p;
                                                            break;
                                                        } else if (!TextUtils.isEmpty(m95690g.f91015t)) {
                                                            str6 = m95690g.f91015t;
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                                    if (!TextUtils.isEmpty(c17997r1.m95686c())) {
                                                        try {
                                                        } catch (Exception e11) {
                                                            e11.printStackTrace();
                                                        }
                                                        if (new JSONObject(c17997r1.m95686c()).optInt("msgBubbleLayoutType") == 1003) {
                                                            string2 = m35500c.getString(AbstractC8020f0.str_reply_msg_gif);
                                                            AbstractC19074t.m100207e(string2, "getString(...)");
                                                            if (m95690g != null && !TextUtils.isEmpty(m95690g.f91011p)) {
                                                                str6 = m95690g.f91011p;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    string2 = m35500c.getString(AbstractC8020f0.str_reply_msg_video);
                                                    AbstractC19074t.m100207e(string2, "getString(...)");
                                                    if (m95690g != null) {
                                                        str6 = m95690g.f91011p;
                                                    }
                                                    break;
                                                case 45:
                                                    string = m35500c.getString(AbstractC8020f0.str_reply_msg_undo);
                                                    AbstractC19074t.m100207e(string, "getString(...)");
                                                    break;
                                                case 46:
                                                    string3 = m35500c.getString(AbstractC8020f0.str_reply_msg_file);
                                                    AbstractC19074t.m100207e(string3, "getString(...)");
                                                    if (m95690g instanceof C17990p0) {
                                                        if (((C17990p0) m95690g).m95670k()) {
                                                            string3 = m35500c.getString(AbstractC8020f0.str_type_msg_folder);
                                                            AbstractC19074t.m100207e(string3, "getString(...)");
                                                        }
                                                        if (!TextUtils.isEmpty(m95690g.f91011p)) {
                                                            C17990p0 c17990p0 = (C17990p0) m95690g;
                                                            if (c17990p0.m95670k()) {
                                                                str4 = c17990p0.m95667h();
                                                                AbstractC19074t.m100205c(str4);
                                                            } else {
                                                                str4 = m95690g.f91011p;
                                                            }
                                                            if (!TextUtils.isEmpty(str4)) {
                                                                str3 = str4;
                                                                str6 = string3;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    str4 = "";
                                                    if (!TextUtils.isEmpty(str4)) {
                                                    }
                                                    break;
                                                default:
                                                    string = m35500c.getString(AbstractC8020f0.str_bubble_unsupport_message);
                                                    AbstractC19074t.m100207e(string, "getString(...)");
                                                    break;
                                            }
                                    }
                                    if (!TextUtils.isEmpty(str3)) {
                                        if (m95690g != null && (c7907e = m95690g.f91018w) != null && (c17997r1.m95687d() == 1 || c17997r1.m95687d() == 41 || c17997r1.m95687d() == 32 || (c17997r1.m95687d() == 38 && !TextUtils.isEmpty(m95690g.f91011p)))) {
                                            List m40857g = c7907e.m40857g();
                                            AbstractC19074t.m100205c(m40857g);
                                            str3 = m102677N(m40857g, str3, str2, null, null, null, 56, null);
                                        }
                                        if (str3.length() > 150) {
                                            str3 = str3.substring(0, 150);
                                            AbstractC19074t.m100207e(str3, "substring(...)");
                                        }
                                        str3 = AbstractC24341v.m127113C(str3, '\n', ' ', false, 4, null);
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        str6 = str3;
                                    } else if (!TextUtils.isEmpty(str3)) {
                                        str6 = str6 + " " + str3;
                                    }
                                    return new C19660u0(m119453k, str6);
                                }
                                string3 = m35500c.getString(AbstractC8020f0.str_reply_msg_photo);
                                AbstractC19074t.m100207e(string3, "getString(...)");
                                if (m95690g != null && !TextUtils.isEmpty(m95690g.f91017v)) {
                                    try {
                                        if (!TextUtils.isEmpty(new JSONObject(m95690g.f91017v).getJSONObject("webp").optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, ""))) {
                                            String string5 = m35500c.getString(AbstractC8020f0.str_reply_msg_sticker);
                                            AbstractC19074t.m100207e(string5, "getString(...)");
                                            string3 = string5;
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                                if (m95690g != null && !TextUtils.isEmpty(m95690g.f91011p)) {
                                    str6 = m95690g.f91011p;
                                }
                                str3 = str6;
                                str6 = string3;
                                if (!TextUtils.isEmpty(str3)) {
                                }
                                if (!TextUtils.isEmpty(str6)) {
                                }
                                return new C19660u0(m119453k, str6);
                            }
                            string2 = m35500c.getString(AbstractC8020f0.str_reply_msg_voice);
                            AbstractC19074t.m100207e(string2, "getString(...)");
                        } else {
                            string2 = m35500c.getString(AbstractC8020f0.str_type_msg_live_location_v2);
                            AbstractC19074t.m100207e(string2, "getString(...)");
                        }
                    } else {
                        string = c17997r1.m95688e();
                        AbstractC19074t.m100207e(string, "getMessage(...)");
                        if (m95690g instanceof C17967h1) {
                            C17967h1 c17967h1 = (C17967h1) m95690g;
                            String m95579j = c17967h1.m95579j();
                            AbstractC19074t.m100207e(m95579j, "getCustomMsg(...)");
                            if (m95579j.length() > 0) {
                                string = c17967h1.m95579j();
                                AbstractC19074t.m100207e(string, "getCustomMsg(...)");
                            }
                        }
                    }
                } else {
                    string2 = m35500c.getString(AbstractC8020f0.str_reply_msg_gif);
                    AbstractC19074t.m100207e(string2, "getString(...)");
                }
                str3 = str6;
                str6 = string2;
                if (!TextUtils.isEmpty(str3)) {
                }
                if (!TextUtils.isEmpty(str6)) {
                }
                return new C19660u0(m119453k, str6);
            }
            string = c17997r1.m95688e();
            AbstractC19074t.m100207e(string, "getMessage(...)");
        } else {
            string = m35500c.getString(AbstractC8020f0.str_msg_deleted);
            AbstractC19074t.m100207e(string, "getString(...)");
        }
        str3 = string;
        if (!TextUtils.isEmpty(str3)) {
        }
        if (!TextUtils.isEmpty(str6)) {
        }
        return new C19660u0(m119453k, str6);
    }

    /* renamed from: y */
    public static final String m102705y(Conversation conversation, C17945a0 c17945a0) {
        String m94854B4;
        String m127114D;
        CharSequence m127168X0;
        AbstractC19074t.m100208f(conversation, "conversation");
        AbstractC19074t.m100208f(c17945a0, "chatLine");
        if (!conversation.m41013q() || c17945a0.m95032V6()) {
            return "";
        }
        try {
            String str = conversation.f42893q;
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, c17945a0.m94862C4(), null, 2, null);
            if (m141798e != null) {
                String m40383Q = m141798e.m40383Q(true, false);
                AbstractC19074t.m100205c(m40383Q);
                m127114D = AbstractC24341v.m127114D(m40383Q, "\n", " ", false, 4, null);
                m127168X0 = AbstractC24342w.m127168X0(m127114D);
                m94854B4 = m127168X0.toString();
            } else {
                m94854B4 = c17945a0.m94854B4();
            }
            C31973j5 m4472f = C0943w.f3447a.m4472f(str);
            if (m4472f != null) {
                String m94862C4 = c17945a0.m94862C4();
                AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
                m94854B4 = m4472f.m153707B(m94862C4, m94854B4);
                AbstractC19074t.m100205c(m94854B4);
            }
            AbstractC19074t.m100205c(m94854B4);
            return m94854B4;
        } catch (Exception e11) {
            AbstractC23350e.m122774d("MessageTextUtils", e11.toString());
            return "";
        }
    }

    /* renamed from: z */
    public static final String m102706z(Conversation conversation) {
        AbstractC19074t.m100208f(conversation, "conversation");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_hidden_setup_with_friend_done);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Conversation.m40990d(conversation, true, false, false, 4, null)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }
}
