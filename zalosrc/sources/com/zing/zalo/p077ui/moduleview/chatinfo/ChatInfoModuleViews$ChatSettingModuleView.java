package com.zing.zalo.p077ui.moduleview.chatinfo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter;
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
public class ChatInfoModuleViews$ChatSettingModuleView extends BaseChatSettingItemModuleView implements ChatInfoAdapter.InterfaceC11686a {

    /* renamed from: V */
    public ChatInfoAdapter.C11690e f64564V;

    /* renamed from: W */
    C23528a f64565W;

    /* renamed from: a0 */
    C3977j f64566a0;

    /* renamed from: b0 */
    ChatInfoAdapter.InterfaceC11689d f64567b0;

    public ChatInfoModuleViews$ChatSettingModuleView(Context context, C23528a c23528a, ChatInfoAdapter.InterfaceC11689d interfaceC11689d) {
        super(context);
        this.f64565W = c23528a;
        this.f64566a0 = new C3977j(context);
        this.f64567b0 = interfaceC11689d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f3  */
    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11686a
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo65101f(ChatInfoAdapter.C11690e c11690e, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f64564V = c11690e;
        ChatInfoAdapter.C11692g c11692g = (ChatInfoAdapter.C11692g) c11690e;
        int i17 = 0;
        if (c11692g.f60816g != 0) {
            this.f64536S.mo44614b1(0);
            C21693c c21693c = this.f64536S;
            c21693c.mo111925v1(AbstractC23136l9.m118665N(c21693c.getContext(), c11692g.f60816g));
            this.f64529L.m89106L().m89034R(AbstractC23222t7.f112545X);
        } else {
            this.f64536S.mo44614b1(8);
            this.f64529L.m89106L().m89034R(AbstractC23222t7.f112586t);
        }
        if (!TextUtils.isEmpty(c11692g.f60813d)) {
            this.f64531N.m111959G1(c11692g.f60813d);
        } else {
            Spannable spannable = c11692g.f60815f;
            if (spannable != null && !TextUtils.isEmpty(spannable)) {
                this.f64531N.m111959G1(c11692g.f60815f);
            } else {
                this.f64531N.m111959G1(AbstractC23136l9.m118743r0(c11692g.f60812c));
            }
        }
        int i18 = c11692g.f60811b;
        if (i18 != 2 && i18 != 8 && i18 != 40) {
            this.f64531N.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
        } else {
            this.f64531N.m111962J1(C23212s8.m119607o(getContext(), AbstractC7354t0.NotificationColor1));
        }
        this.f64532O.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
        int i19 = c11692g.f60811b;
        if (i19 != 38 && i19 != 48 && i19 != 73) {
            switch (i19) {
                case 68:
                case 69:
                case 70:
                    break;
                default:
                    this.f64532O.mo44614b1(8);
                    break;
            }
            C21693c c21693c2 = this.f64535R;
            if (!c11692g.f60824o) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            c21693c2.mo44614b1(i12);
            this.f64534Q.mo89107L0(null);
            if (!c11692g.f60819j) {
                this.f64534Q.mo44614b1(0);
                this.f64534Q.mo89091D0(c11692g.f60820k);
            } else {
                this.f64534Q.mo44614b1(8);
            }
            if (c11692g.m65118d() != 61) {
                this.f64537T.m111959G1(c11692g.f60823n + "");
                C22126c0 c22126c0 = this.f64537T;
                if (c11692g.f60823n > 0) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                c22126c0.mo44614b1(i16);
            } else {
                C16719g c16719g = this.f64538U;
                if (c11692g.f60818i) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                c16719g.mo44614b1(i13);
            }
            this.f64533P.mo44614b1(8);
            C16719g c16719g2 = this.f64529L;
            if (!c11692g.f60821l) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            c16719g2.mo44614b1(i14);
            C16719g c16719g3 = this.f64528K;
            if (!c11692g.f60825p) {
                i17 = 8;
            }
            c16719g3.mo44614b1(i17);
            i15 = c11692g.f60811b;
            if (i15 == 28) {
                if (i15 != 63) {
                    if (i15 != 69) {
                        if (i15 != 55) {
                            if (i15 == 56) {
                                setId(AbstractC6918a0.cel_option_pinned_message);
                                return;
                            }
                            return;
                        }
                        setId(AbstractC6918a0.cel_option_group_calendar);
                        return;
                    }
                    setId(AbstractC6918a0.cel_option_tab);
                    return;
                }
                setId(AbstractC6918a0.cel_option_polls);
                return;
            }
            setId(AbstractC6918a0.cel_option_media_stored);
            return;
        }
        if (!TextUtils.isEmpty(c11692g.f60814e)) {
            this.f64532O.mo44614b1(0);
            this.f64532O.m111959G1(c11692g.f60814e);
        } else {
            this.f64532O.mo44614b1(8);
        }
        if (c11692g.f60811b == 70 && c11692g.f60827r) {
            this.f64532O.m111962J1(C23212s8.m119607o(getContext(), AbstractC2807a.success_text));
        }
        C21693c c21693c22 = this.f64535R;
        if (!c11692g.f60824o) {
        }
        c21693c22.mo44614b1(i12);
        this.f64534Q.mo89107L0(null);
        if (!c11692g.f60819j) {
        }
        if (c11692g.m65118d() != 61) {
        }
        this.f64533P.mo44614b1(8);
        C16719g c16719g22 = this.f64529L;
        if (!c11692g.f60821l) {
        }
        c16719g22.mo44614b1(i14);
        C16719g c16719g32 = this.f64528K;
        if (!c11692g.f60825p) {
        }
        c16719g32.mo44614b1(i17);
        i15 = c11692g.f60811b;
        if (i15 == 28) {
        }
    }
}
