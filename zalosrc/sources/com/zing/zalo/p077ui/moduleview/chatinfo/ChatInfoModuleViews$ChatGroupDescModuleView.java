package com.zing.zalo.p077ui.moduleview.chatinfo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16719g;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p354n3.C23528a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class ChatInfoModuleViews$ChatGroupDescModuleView extends BaseChatSettingItemModuleView implements ChatInfoAdapter.InterfaceC11686a {

    /* renamed from: V */
    public ChatInfoAdapter.C11690e f64559V;

    /* renamed from: W */
    C23528a f64560W;

    /* renamed from: a0 */
    C3977j f64561a0;

    /* renamed from: b0 */
    ChatInfoAdapter.InterfaceC11689d f64562b0;

    /* renamed from: c0 */
    int f64563c0;

    public ChatInfoModuleViews$ChatGroupDescModuleView(Context context, C23528a c23528a, ChatInfoAdapter.InterfaceC11689d interfaceC11689d) {
        super(context);
        this.f64563c0 = 2;
        this.f64560W = c23528a;
        this.f64561a0 = new C3977j(context);
        this.f64562b0 = interfaceC11689d;
    }

    /* renamed from: W */
    private SpannableString m69696W(Context context, String str, String str2, C13704p1 c13704p1, float f11, int i11) {
        String replaceAll = str.trim().replaceAll("\n{2,}", "\n");
        float m69698Y = m69698Y(c13704p1, " " + str2) + (m69698Y(c13704p1, "...") * 2.0f);
        String str3 = "";
        String str4 = replaceAll;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            Pair m69697X = m69697X(c13704p1, str4, f11, 0.0f, true);
            String substring = str4.substring(((Integer) m69697X.first).intValue() + 1);
            if (i12 == i11 - 1 && !TextUtils.isEmpty(substring.trim())) {
                m69697X = m69697X(c13704p1, str4, f11, m69698Y, false);
            }
            str3 = str3 + ((String) m69697X.second);
            if (TextUtils.isEmpty(substring)) {
                str4 = substring;
                break;
            }
            i12++;
            str4 = substring;
        }
        if (TextUtils.isEmpty(str4.trim())) {
            return new SpannableString(replaceAll);
        }
        return m69699V(str3, str2, C23212s8.m119607o(context, AbstractC16781w.LinkColor));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:            return android.util.Pair.create(java.lang.Integer.valueOf(r4), r12.substring(0, r4) + '\n');     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:            return android.util.Pair.create(java.lang.Integer.valueOf(r13), r12.substring(0, r13) + '\n');     */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Pair m69697X(C13704p1 c13704p1, String str, float f11, float f12, boolean z11) {
        String str2 = "";
        Pair create = Pair.create(0, "");
        int length = str.length();
        int i11 = 0;
        while (true) {
            char charAt = str.charAt(i11);
            float m69698Y = m69698Y(c13704p1, str2 + charAt) + f12;
            int i12 = i11 + 1;
            if (m69698Y > f11) {
                char charAt2 = str.charAt(i11);
                int i13 = i11;
                while (z11 && i13 > 0 && charAt2 != ' ' && charAt2 != '\t' && charAt2 != '\r' && charAt2 != '\n') {
                    i13--;
                    charAt2 = str.charAt(i13);
                }
                return Pair.create(Integer.valueOf(i11), str.substring(0, i11));
            }
            if (charAt == '\n' || i12 == length) {
                break;
            }
            str2 = str2 + charAt;
            if (m69698Y > f11 || charAt == '\n' || i12 >= length) {
                break;
            }
            i11 = i12;
        }
        return create;
    }

    /* renamed from: Y */
    private float m69698Y(C13704p1 c13704p1, String str) {
        return AbstractC23136l9.m118764y0(c13704p1, str);
    }

    /* renamed from: V */
    SpannableString m69699V(String str, String str2, int i11) {
        String trim = str.trim();
        String str3 = trim + "... " + str2;
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new ForegroundColorSpan(i11), trim.length() + 4, str3.length(), 33);
        return spannableString;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11686a
    /* renamed from: f */
    public void mo65101f(ChatInfoAdapter.C11690e c11690e, int i11) {
        int i12;
        int i13;
        String m118743r0;
        this.f64559V = c11690e;
        ChatInfoAdapter.C11692g c11692g = (ChatInfoAdapter.C11692g) c11690e;
        int i14 = 0;
        if (c11692g.f60816g != 0) {
            this.f64536S.mo44614b1(0);
            C21693c c21693c = this.f64536S;
            c21693c.mo111925v1(AbstractC23136l9.m118665N(c21693c.getContext(), c11692g.f60816g));
        } else {
            this.f64536S.mo44614b1(8);
        }
        this.f64531N.m111953A1(this.f64563c0);
        this.f64531N.m111980v1(TextUtils.TruncateAt.END);
        C22126c0 c22126c0 = this.f64531N;
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC21196a.TextColor1));
        if (c11692g.f60817h) {
            if (!TextUtils.isEmpty(c11692g.f60813d)) {
                m118743r0 = c11692g.f60813d;
            } else {
                Spannable spannable = c11692g.f60815f;
                if (spannable != null && !TextUtils.isEmpty(spannable)) {
                    m118743r0 = c11692g.f60815f.toString();
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(c11692g.f60812c);
                }
            }
            String str = m118743r0;
            C13704p1 c13704p1 = new C13704p1();
            c13704p1.setTextSize(AbstractC23222t7.f112586t);
            c13704p1.setTypeface(Typeface.DEFAULT);
            this.f64531N.m111959G1(m69696W(this.f64531N.getContext(), str, AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more), c13704p1, AbstractC23136l9.m118722k0() - ((AbstractC23222t7.f112586t * 3) + AbstractC23222t7.f112514B), this.f64563c0));
        } else {
            this.f64531N.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
            if (!TextUtils.isEmpty(c11692g.f60813d)) {
                this.f64531N.m111959G1(c11692g.f60813d);
            } else {
                Spannable spannable2 = c11692g.f60815f;
                if (spannable2 != null && !TextUtils.isEmpty(spannable2)) {
                    this.f64531N.m111959G1(c11692g.f60815f);
                } else {
                    this.f64531N.m111959G1(AbstractC23136l9.m118743r0(c11692g.f60812c));
                }
            }
        }
        this.f64532O.mo44614b1(8);
        this.f64535R.mo44614b1(8);
        this.f64534Q.mo89107L0(null);
        if (c11692g.f60819j) {
            this.f64534Q.mo44614b1(0);
            this.f64534Q.mo89091D0(c11692g.f60820k);
        } else {
            this.f64534Q.mo44614b1(8);
        }
        C16719g c16719g = this.f64538U;
        if (c11692g.f60818i) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        c16719g.mo44614b1(i12);
        this.f64533P.mo44614b1(8);
        C16719g c16719g2 = this.f64529L;
        if (c11692g.f60821l) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        c16719g2.mo44614b1(i13);
        C16719g c16719g3 = this.f64528K;
        if (!c11692g.f60825p) {
            i14 = 8;
        }
        c16719g3.mo44614b1(i14);
    }
}
