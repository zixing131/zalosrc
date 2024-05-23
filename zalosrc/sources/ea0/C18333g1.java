package ea0;

import ag0.AbstractC0837p0;
import ai.InterfaceC0861a;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.widget.SimpleAdapter;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.C7207s6;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.searchglobal.subscreen.SearchGlobalSubScreenView;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalResultPageLayout;
import com.zing.zalo.p077ui.zviews.QuickAccessContactPickerView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l30.AbstractC22055v0;
import l30.C22021e0;
import l80.C22126c0;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23152n3;
import me0.AbstractC23210s6;
import me0.C23024b7;
import mm0.AbstractC23350e;
import p006a0.C0012a;
import p056cj.AbstractC3552t;
import p056cj.C3549q;
import p056cj.C3551s;
import p172fy.C19171b;
import p239ih.C20556f;
import p266jg.AbstractC21244b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29076h;
import p612wk.AbstractC29080l;
import p716zh.C32020m7;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24861r;
import q80.C25182u;
import qm0.AbstractC25332a0;
import qm0.AbstractC25363p0;
import qm0.C25345g0;
import tk.C26723b;
import v50.C27870vb;
import vg.AbstractRunnableC28185s6;

/* renamed from: ea0.g1 */
/* loaded from: classes6.dex */
public final class C18333g1 {

    /* renamed from: a */
    public static final C18333g1 f92667a = new C18333g1();

    /* renamed from: ea0.g1$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractRunnableC28185s6 {

        /* renamed from: z */
        final /* synthetic */ InterfaceC18505l f92668z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractRunnableC28185s6.b bVar, InterfaceC18505l interfaceC18505l, List list) {
            super(bVar, list, 1040);
            this.f92668z = interfaceC18505l;
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(ArrayList arrayList) {
            Object m131206f0;
            super.mo61137c(arrayList);
            if (arrayList != null) {
                m131206f0 = AbstractC25332a0.m131206f0(arrayList);
                ContactProfile contactProfile = (ContactProfile) m131206f0;
                if (contactProfile != null) {
                    InterfaceC18505l interfaceC18505l = this.f92668z;
                    String str = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str, "uid");
                    interfaceC18505l.mo205i9(str);
                }
            }
        }
    }

    private C18333g1() {
    }

    /* renamed from: B */
    public static final void m97264B(SimpleAdapter simpleAdapter, InterfaceC18505l interfaceC18505l, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(simpleAdapter, "$a");
        AbstractC19074t.m100208f(interfaceC18505l, "$onPopUpClickAction");
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        try {
            interfaceC17463d.dismiss();
            Object item = simpleAdapter.getItem(i11);
            AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
            Object obj = ((HashMap) item).get("id");
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            interfaceC18505l.mo205i9(Integer.valueOf(((Integer) obj).intValue()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: G */
    public static final void m97265G(int i11, int i12, C18328f c18328f) {
        AbstractC29069a.a aVar;
        AbstractC19074t.m100208f(c18328f, "$adapter");
        if (i11 >= 0 && i11 < i12) {
            Object obj = c18328f.m97242L().get(i11);
            if (obj instanceof AbstractC29069a.a) {
                aVar = (AbstractC29069a.a) obj;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.m145139A(true);
            }
            c18328f.m10009q(i11);
        }
    }

    /* renamed from: J */
    public static final void m97266J(List list, C18328f c18328f) {
        AbstractC19074t.m100208f(list, "$indexList");
        AbstractC19074t.m100208f(c18328f, "$adapter");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25345g0 c25345g0 = (C25345g0) it.next();
            int mo10003k = c18328f.mo10003k();
            int m131263a = c25345g0.m131263a();
            if (m131263a >= 0 && m131263a < mo10003k) {
                c18328f.m10010r(c25345g0.m131263a(), "UserStoryChanged");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x072d A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0018, B:5:0x001c, B:9:0x0026, B:13:0x0778, B:17:0x077f, B:20:0x0032, B:23:0x003e, B:25:0x016a, B:28:0x017f, B:29:0x01fa, B:31:0x0202, B:33:0x0226, B:35:0x022e, B:36:0x0247, B:38:0x0255, B:55:0x02da, B:56:0x02dd, B:57:0x02ef, B:59:0x02f3, B:61:0x0302, B:64:0x0310, B:68:0x032c, B:70:0x0371, B:75:0x0387, B:77:0x038d, B:78:0x03c9, B:80:0x03cf, B:82:0x03e5, B:84:0x03ec, B:86:0x03f4, B:89:0x0474, B:91:0x0480, B:92:0x04a6, B:94:0x04be, B:96:0x04c6, B:98:0x04cc, B:99:0x0500, B:100:0x04f3, B:102:0x0727, B:104:0x072d, B:106:0x0775, B:109:0x041a, B:111:0x0422, B:112:0x0447, B:117:0x0511, B:118:0x051b, B:120:0x051f, B:122:0x0524, B:124:0x052c, B:126:0x0640, B:128:0x064a, B:130:0x06af, B:132:0x06bb, B:134:0x06bf, B:137:0x06cc, B:138:0x0707, B:139:0x0710, B:141:0x071e, B:142:0x06ea, B:144:0x0553, B:148:0x057d, B:149:0x05a4, B:151:0x05ae, B:155:0x05ba, B:156:0x05c5, B:157:0x05eb, B:159:0x05f3, B:160:0x0619, B:162:0x0654, B:164:0x0662, B:165:0x0688, B:166:0x03d5, B:167:0x039d, B:169:0x03a8, B:171:0x03b9, B:172:0x031a, B:173:0x0309, B:174:0x031f, B:177:0x0327, B:186:0x023c, B:187:0x0212, B:189:0x0218, B:191:0x0191, B:193:0x0199, B:194:0x01ab, B:200:0x01f1, B:201:0x01b5, B:203:0x01bd, B:205:0x01c3, B:206:0x004e, B:208:0x0054, B:210:0x0062, B:213:0x006e, B:217:0x0088, B:223:0x009d, B:232:0x00a4, B:235:0x00a7, B:239:0x00b5, B:243:0x00cb, B:276:0x00de, B:249:0x00e4, B:254:0x00e7, B:269:0x0163, B:272:0x0160, B:257:0x00f6, B:259:0x00ff, B:261:0x0110, B:263:0x0132), top: B:2:0x0018, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x039d A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0018, B:5:0x001c, B:9:0x0026, B:13:0x0778, B:17:0x077f, B:20:0x0032, B:23:0x003e, B:25:0x016a, B:28:0x017f, B:29:0x01fa, B:31:0x0202, B:33:0x0226, B:35:0x022e, B:36:0x0247, B:38:0x0255, B:55:0x02da, B:56:0x02dd, B:57:0x02ef, B:59:0x02f3, B:61:0x0302, B:64:0x0310, B:68:0x032c, B:70:0x0371, B:75:0x0387, B:77:0x038d, B:78:0x03c9, B:80:0x03cf, B:82:0x03e5, B:84:0x03ec, B:86:0x03f4, B:89:0x0474, B:91:0x0480, B:92:0x04a6, B:94:0x04be, B:96:0x04c6, B:98:0x04cc, B:99:0x0500, B:100:0x04f3, B:102:0x0727, B:104:0x072d, B:106:0x0775, B:109:0x041a, B:111:0x0422, B:112:0x0447, B:117:0x0511, B:118:0x051b, B:120:0x051f, B:122:0x0524, B:124:0x052c, B:126:0x0640, B:128:0x064a, B:130:0x06af, B:132:0x06bb, B:134:0x06bf, B:137:0x06cc, B:138:0x0707, B:139:0x0710, B:141:0x071e, B:142:0x06ea, B:144:0x0553, B:148:0x057d, B:149:0x05a4, B:151:0x05ae, B:155:0x05ba, B:156:0x05c5, B:157:0x05eb, B:159:0x05f3, B:160:0x0619, B:162:0x0654, B:164:0x0662, B:165:0x0688, B:166:0x03d5, B:167:0x039d, B:169:0x03a8, B:171:0x03b9, B:172:0x031a, B:173:0x0309, B:174:0x031f, B:177:0x0327, B:186:0x023c, B:187:0x0212, B:189:0x0218, B:191:0x0191, B:193:0x0199, B:194:0x01ab, B:200:0x01f1, B:201:0x01b5, B:203:0x01bd, B:205:0x01c3, B:206:0x004e, B:208:0x0054, B:210:0x0062, B:213:0x006e, B:217:0x0088, B:223:0x009d, B:232:0x00a4, B:235:0x00a7, B:239:0x00b5, B:243:0x00cb, B:276:0x00de, B:249:0x00e4, B:254:0x00e7, B:269:0x0163, B:272:0x0160, B:257:0x00f6, B:259:0x00ff, B:261:0x0110, B:263:0x0132), top: B:2:0x0018, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03a8 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0018, B:5:0x001c, B:9:0x0026, B:13:0x0778, B:17:0x077f, B:20:0x0032, B:23:0x003e, B:25:0x016a, B:28:0x017f, B:29:0x01fa, B:31:0x0202, B:33:0x0226, B:35:0x022e, B:36:0x0247, B:38:0x0255, B:55:0x02da, B:56:0x02dd, B:57:0x02ef, B:59:0x02f3, B:61:0x0302, B:64:0x0310, B:68:0x032c, B:70:0x0371, B:75:0x0387, B:77:0x038d, B:78:0x03c9, B:80:0x03cf, B:82:0x03e5, B:84:0x03ec, B:86:0x03f4, B:89:0x0474, B:91:0x0480, B:92:0x04a6, B:94:0x04be, B:96:0x04c6, B:98:0x04cc, B:99:0x0500, B:100:0x04f3, B:102:0x0727, B:104:0x072d, B:106:0x0775, B:109:0x041a, B:111:0x0422, B:112:0x0447, B:117:0x0511, B:118:0x051b, B:120:0x051f, B:122:0x0524, B:124:0x052c, B:126:0x0640, B:128:0x064a, B:130:0x06af, B:132:0x06bb, B:134:0x06bf, B:137:0x06cc, B:138:0x0707, B:139:0x0710, B:141:0x071e, B:142:0x06ea, B:144:0x0553, B:148:0x057d, B:149:0x05a4, B:151:0x05ae, B:155:0x05ba, B:156:0x05c5, B:157:0x05eb, B:159:0x05f3, B:160:0x0619, B:162:0x0654, B:164:0x0662, B:165:0x0688, B:166:0x03d5, B:167:0x039d, B:169:0x03a8, B:171:0x03b9, B:172:0x031a, B:173:0x0309, B:174:0x031f, B:177:0x0327, B:186:0x023c, B:187:0x0212, B:189:0x0218, B:191:0x0191, B:193:0x0199, B:194:0x01ab, B:200:0x01f1, B:201:0x01b5, B:203:0x01bd, B:205:0x01c3, B:206:0x004e, B:208:0x0054, B:210:0x0062, B:213:0x006e, B:217:0x0088, B:223:0x009d, B:232:0x00a4, B:235:0x00a7, B:239:0x00b5, B:243:0x00cb, B:276:0x00de, B:249:0x00e4, B:254:0x00e7, B:269:0x0163, B:272:0x0160, B:257:0x00f6, B:259:0x00ff, B:261:0x0110, B:263:0x0132), top: B:2:0x0018, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0327 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0018, B:5:0x001c, B:9:0x0026, B:13:0x0778, B:17:0x077f, B:20:0x0032, B:23:0x003e, B:25:0x016a, B:28:0x017f, B:29:0x01fa, B:31:0x0202, B:33:0x0226, B:35:0x022e, B:36:0x0247, B:38:0x0255, B:55:0x02da, B:56:0x02dd, B:57:0x02ef, B:59:0x02f3, B:61:0x0302, B:64:0x0310, B:68:0x032c, B:70:0x0371, B:75:0x0387, B:77:0x038d, B:78:0x03c9, B:80:0x03cf, B:82:0x03e5, B:84:0x03ec, B:86:0x03f4, B:89:0x0474, B:91:0x0480, B:92:0x04a6, B:94:0x04be, B:96:0x04c6, B:98:0x04cc, B:99:0x0500, B:100:0x04f3, B:102:0x0727, B:104:0x072d, B:106:0x0775, B:109:0x041a, B:111:0x0422, B:112:0x0447, B:117:0x0511, B:118:0x051b, B:120:0x051f, B:122:0x0524, B:124:0x052c, B:126:0x0640, B:128:0x064a, B:130:0x06af, B:132:0x06bb, B:134:0x06bf, B:137:0x06cc, B:138:0x0707, B:139:0x0710, B:141:0x071e, B:142:0x06ea, B:144:0x0553, B:148:0x057d, B:149:0x05a4, B:151:0x05ae, B:155:0x05ba, B:156:0x05c5, B:157:0x05eb, B:159:0x05f3, B:160:0x0619, B:162:0x0654, B:164:0x0662, B:165:0x0688, B:166:0x03d5, B:167:0x039d, B:169:0x03a8, B:171:0x03b9, B:172:0x031a, B:173:0x0309, B:174:0x031f, B:177:0x0327, B:186:0x023c, B:187:0x0212, B:189:0x0218, B:191:0x0191, B:193:0x0199, B:194:0x01ab, B:200:0x01f1, B:201:0x01b5, B:203:0x01bd, B:205:0x01c3, B:206:0x004e, B:208:0x0054, B:210:0x0062, B:213:0x006e, B:217:0x0088, B:223:0x009d, B:232:0x00a4, B:235:0x00a7, B:239:0x00b5, B:243:0x00cb, B:276:0x00de, B:249:0x00e4, B:254:0x00e7, B:269:0x0163, B:272:0x0160, B:257:0x00f6, B:259:0x00ff, B:261:0x0110, B:263:0x0132), top: B:2:0x0018, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f3 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0018, B:5:0x001c, B:9:0x0026, B:13:0x0778, B:17:0x077f, B:20:0x0032, B:23:0x003e, B:25:0x016a, B:28:0x017f, B:29:0x01fa, B:31:0x0202, B:33:0x0226, B:35:0x022e, B:36:0x0247, B:38:0x0255, B:55:0x02da, B:56:0x02dd, B:57:0x02ef, B:59:0x02f3, B:61:0x0302, B:64:0x0310, B:68:0x032c, B:70:0x0371, B:75:0x0387, B:77:0x038d, B:78:0x03c9, B:80:0x03cf, B:82:0x03e5, B:84:0x03ec, B:86:0x03f4, B:89:0x0474, B:91:0x0480, B:92:0x04a6, B:94:0x04be, B:96:0x04c6, B:98:0x04cc, B:99:0x0500, B:100:0x04f3, B:102:0x0727, B:104:0x072d, B:106:0x0775, B:109:0x041a, B:111:0x0422, B:112:0x0447, B:117:0x0511, B:118:0x051b, B:120:0x051f, B:122:0x0524, B:124:0x052c, B:126:0x0640, B:128:0x064a, B:130:0x06af, B:132:0x06bb, B:134:0x06bf, B:137:0x06cc, B:138:0x0707, B:139:0x0710, B:141:0x071e, B:142:0x06ea, B:144:0x0553, B:148:0x057d, B:149:0x05a4, B:151:0x05ae, B:155:0x05ba, B:156:0x05c5, B:157:0x05eb, B:159:0x05f3, B:160:0x0619, B:162:0x0654, B:164:0x0662, B:165:0x0688, B:166:0x03d5, B:167:0x039d, B:169:0x03a8, B:171:0x03b9, B:172:0x031a, B:173:0x0309, B:174:0x031f, B:177:0x0327, B:186:0x023c, B:187:0x0212, B:189:0x0218, B:191:0x0191, B:193:0x0199, B:194:0x01ab, B:200:0x01f1, B:201:0x01b5, B:203:0x01bd, B:205:0x01c3, B:206:0x004e, B:208:0x0054, B:210:0x0062, B:213:0x006e, B:217:0x0088, B:223:0x009d, B:232:0x00a4, B:235:0x00a7, B:239:0x00b5, B:243:0x00cb, B:276:0x00de, B:249:0x00e4, B:254:0x00e7, B:269:0x0163, B:272:0x0160, B:257:0x00f6, B:259:0x00ff, B:261:0x0110, B:263:0x0132), top: B:2:0x0018, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0371 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0018, B:5:0x001c, B:9:0x0026, B:13:0x0778, B:17:0x077f, B:20:0x0032, B:23:0x003e, B:25:0x016a, B:28:0x017f, B:29:0x01fa, B:31:0x0202, B:33:0x0226, B:35:0x022e, B:36:0x0247, B:38:0x0255, B:55:0x02da, B:56:0x02dd, B:57:0x02ef, B:59:0x02f3, B:61:0x0302, B:64:0x0310, B:68:0x032c, B:70:0x0371, B:75:0x0387, B:77:0x038d, B:78:0x03c9, B:80:0x03cf, B:82:0x03e5, B:84:0x03ec, B:86:0x03f4, B:89:0x0474, B:91:0x0480, B:92:0x04a6, B:94:0x04be, B:96:0x04c6, B:98:0x04cc, B:99:0x0500, B:100:0x04f3, B:102:0x0727, B:104:0x072d, B:106:0x0775, B:109:0x041a, B:111:0x0422, B:112:0x0447, B:117:0x0511, B:118:0x051b, B:120:0x051f, B:122:0x0524, B:124:0x052c, B:126:0x0640, B:128:0x064a, B:130:0x06af, B:132:0x06bb, B:134:0x06bf, B:137:0x06cc, B:138:0x0707, B:139:0x0710, B:141:0x071e, B:142:0x06ea, B:144:0x0553, B:148:0x057d, B:149:0x05a4, B:151:0x05ae, B:155:0x05ba, B:156:0x05c5, B:157:0x05eb, B:159:0x05f3, B:160:0x0619, B:162:0x0654, B:164:0x0662, B:165:0x0688, B:166:0x03d5, B:167:0x039d, B:169:0x03a8, B:171:0x03b9, B:172:0x031a, B:173:0x0309, B:174:0x031f, B:177:0x0327, B:186:0x023c, B:187:0x0212, B:189:0x0218, B:191:0x0191, B:193:0x0199, B:194:0x01ab, B:200:0x01f1, B:201:0x01b5, B:203:0x01bd, B:205:0x01c3, B:206:0x004e, B:208:0x0054, B:210:0x0062, B:213:0x006e, B:217:0x0088, B:223:0x009d, B:232:0x00a4, B:235:0x00a7, B:239:0x00b5, B:243:0x00cb, B:276:0x00de, B:249:0x00e4, B:254:0x00e7, B:269:0x0163, B:272:0x0160, B:257:0x00f6, B:259:0x00ff, B:261:0x0110, B:263:0x0132), top: B:2:0x0018, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x038d A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0018, B:5:0x001c, B:9:0x0026, B:13:0x0778, B:17:0x077f, B:20:0x0032, B:23:0x003e, B:25:0x016a, B:28:0x017f, B:29:0x01fa, B:31:0x0202, B:33:0x0226, B:35:0x022e, B:36:0x0247, B:38:0x0255, B:55:0x02da, B:56:0x02dd, B:57:0x02ef, B:59:0x02f3, B:61:0x0302, B:64:0x0310, B:68:0x032c, B:70:0x0371, B:75:0x0387, B:77:0x038d, B:78:0x03c9, B:80:0x03cf, B:82:0x03e5, B:84:0x03ec, B:86:0x03f4, B:89:0x0474, B:91:0x0480, B:92:0x04a6, B:94:0x04be, B:96:0x04c6, B:98:0x04cc, B:99:0x0500, B:100:0x04f3, B:102:0x0727, B:104:0x072d, B:106:0x0775, B:109:0x041a, B:111:0x0422, B:112:0x0447, B:117:0x0511, B:118:0x051b, B:120:0x051f, B:122:0x0524, B:124:0x052c, B:126:0x0640, B:128:0x064a, B:130:0x06af, B:132:0x06bb, B:134:0x06bf, B:137:0x06cc, B:138:0x0707, B:139:0x0710, B:141:0x071e, B:142:0x06ea, B:144:0x0553, B:148:0x057d, B:149:0x05a4, B:151:0x05ae, B:155:0x05ba, B:156:0x05c5, B:157:0x05eb, B:159:0x05f3, B:160:0x0619, B:162:0x0654, B:164:0x0662, B:165:0x0688, B:166:0x03d5, B:167:0x039d, B:169:0x03a8, B:171:0x03b9, B:172:0x031a, B:173:0x0309, B:174:0x031f, B:177:0x0327, B:186:0x023c, B:187:0x0212, B:189:0x0218, B:191:0x0191, B:193:0x0199, B:194:0x01ab, B:200:0x01f1, B:201:0x01b5, B:203:0x01bd, B:205:0x01c3, B:206:0x004e, B:208:0x0054, B:210:0x0062, B:213:0x006e, B:217:0x0088, B:223:0x009d, B:232:0x00a4, B:235:0x00a7, B:239:0x00b5, B:243:0x00cb, B:276:0x00de, B:249:0x00e4, B:254:0x00e7, B:269:0x0163, B:272:0x0160, B:257:0x00f6, B:259:0x00ff, B:261:0x0110, B:263:0x0132), top: B:2:0x0018, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03cf A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0018, B:5:0x001c, B:9:0x0026, B:13:0x0778, B:17:0x077f, B:20:0x0032, B:23:0x003e, B:25:0x016a, B:28:0x017f, B:29:0x01fa, B:31:0x0202, B:33:0x0226, B:35:0x022e, B:36:0x0247, B:38:0x0255, B:55:0x02da, B:56:0x02dd, B:57:0x02ef, B:59:0x02f3, B:61:0x0302, B:64:0x0310, B:68:0x032c, B:70:0x0371, B:75:0x0387, B:77:0x038d, B:78:0x03c9, B:80:0x03cf, B:82:0x03e5, B:84:0x03ec, B:86:0x03f4, B:89:0x0474, B:91:0x0480, B:92:0x04a6, B:94:0x04be, B:96:0x04c6, B:98:0x04cc, B:99:0x0500, B:100:0x04f3, B:102:0x0727, B:104:0x072d, B:106:0x0775, B:109:0x041a, B:111:0x0422, B:112:0x0447, B:117:0x0511, B:118:0x051b, B:120:0x051f, B:122:0x0524, B:124:0x052c, B:126:0x0640, B:128:0x064a, B:130:0x06af, B:132:0x06bb, B:134:0x06bf, B:137:0x06cc, B:138:0x0707, B:139:0x0710, B:141:0x071e, B:142:0x06ea, B:144:0x0553, B:148:0x057d, B:149:0x05a4, B:151:0x05ae, B:155:0x05ba, B:156:0x05c5, B:157:0x05eb, B:159:0x05f3, B:160:0x0619, B:162:0x0654, B:164:0x0662, B:165:0x0688, B:166:0x03d5, B:167:0x039d, B:169:0x03a8, B:171:0x03b9, B:172:0x031a, B:173:0x0309, B:174:0x031f, B:177:0x0327, B:186:0x023c, B:187:0x0212, B:189:0x0218, B:191:0x0191, B:193:0x0199, B:194:0x01ab, B:200:0x01f1, B:201:0x01b5, B:203:0x01bd, B:205:0x01c3, B:206:0x004e, B:208:0x0054, B:210:0x0062, B:213:0x006e, B:217:0x0088, B:223:0x009d, B:232:0x00a4, B:235:0x00a7, B:239:0x00b5, B:243:0x00cb, B:276:0x00de, B:249:0x00e4, B:254:0x00e7, B:269:0x0163, B:272:0x0160, B:257:0x00f6, B:259:0x00ff, B:261:0x0110, B:263:0x0132), top: B:2:0x0018, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03ec A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0018, B:5:0x001c, B:9:0x0026, B:13:0x0778, B:17:0x077f, B:20:0x0032, B:23:0x003e, B:25:0x016a, B:28:0x017f, B:29:0x01fa, B:31:0x0202, B:33:0x0226, B:35:0x022e, B:36:0x0247, B:38:0x0255, B:55:0x02da, B:56:0x02dd, B:57:0x02ef, B:59:0x02f3, B:61:0x0302, B:64:0x0310, B:68:0x032c, B:70:0x0371, B:75:0x0387, B:77:0x038d, B:78:0x03c9, B:80:0x03cf, B:82:0x03e5, B:84:0x03ec, B:86:0x03f4, B:89:0x0474, B:91:0x0480, B:92:0x04a6, B:94:0x04be, B:96:0x04c6, B:98:0x04cc, B:99:0x0500, B:100:0x04f3, B:102:0x0727, B:104:0x072d, B:106:0x0775, B:109:0x041a, B:111:0x0422, B:112:0x0447, B:117:0x0511, B:118:0x051b, B:120:0x051f, B:122:0x0524, B:124:0x052c, B:126:0x0640, B:128:0x064a, B:130:0x06af, B:132:0x06bb, B:134:0x06bf, B:137:0x06cc, B:138:0x0707, B:139:0x0710, B:141:0x071e, B:142:0x06ea, B:144:0x0553, B:148:0x057d, B:149:0x05a4, B:151:0x05ae, B:155:0x05ba, B:156:0x05c5, B:157:0x05eb, B:159:0x05f3, B:160:0x0619, B:162:0x0654, B:164:0x0662, B:165:0x0688, B:166:0x03d5, B:167:0x039d, B:169:0x03a8, B:171:0x03b9, B:172:0x031a, B:173:0x0309, B:174:0x031f, B:177:0x0327, B:186:0x023c, B:187:0x0212, B:189:0x0218, B:191:0x0191, B:193:0x0199, B:194:0x01ab, B:200:0x01f1, B:201:0x01b5, B:203:0x01bd, B:205:0x01c3, B:206:0x004e, B:208:0x0054, B:210:0x0062, B:213:0x006e, B:217:0x0088, B:223:0x009d, B:232:0x00a4, B:235:0x00a7, B:239:0x00b5, B:243:0x00cb, B:276:0x00de, B:249:0x00e4, B:254:0x00e7, B:269:0x0163, B:272:0x0160, B:257:0x00f6, B:259:0x00ff, B:261:0x0110, B:263:0x0132), top: B:2:0x0018, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04be A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0018, B:5:0x001c, B:9:0x0026, B:13:0x0778, B:17:0x077f, B:20:0x0032, B:23:0x003e, B:25:0x016a, B:28:0x017f, B:29:0x01fa, B:31:0x0202, B:33:0x0226, B:35:0x022e, B:36:0x0247, B:38:0x0255, B:55:0x02da, B:56:0x02dd, B:57:0x02ef, B:59:0x02f3, B:61:0x0302, B:64:0x0310, B:68:0x032c, B:70:0x0371, B:75:0x0387, B:77:0x038d, B:78:0x03c9, B:80:0x03cf, B:82:0x03e5, B:84:0x03ec, B:86:0x03f4, B:89:0x0474, B:91:0x0480, B:92:0x04a6, B:94:0x04be, B:96:0x04c6, B:98:0x04cc, B:99:0x0500, B:100:0x04f3, B:102:0x0727, B:104:0x072d, B:106:0x0775, B:109:0x041a, B:111:0x0422, B:112:0x0447, B:117:0x0511, B:118:0x051b, B:120:0x051f, B:122:0x0524, B:124:0x052c, B:126:0x0640, B:128:0x064a, B:130:0x06af, B:132:0x06bb, B:134:0x06bf, B:137:0x06cc, B:138:0x0707, B:139:0x0710, B:141:0x071e, B:142:0x06ea, B:144:0x0553, B:148:0x057d, B:149:0x05a4, B:151:0x05ae, B:155:0x05ba, B:156:0x05c5, B:157:0x05eb, B:159:0x05f3, B:160:0x0619, B:162:0x0654, B:164:0x0662, B:165:0x0688, B:166:0x03d5, B:167:0x039d, B:169:0x03a8, B:171:0x03b9, B:172:0x031a, B:173:0x0309, B:174:0x031f, B:177:0x0327, B:186:0x023c, B:187:0x0212, B:189:0x0218, B:191:0x0191, B:193:0x0199, B:194:0x01ab, B:200:0x01f1, B:201:0x01b5, B:203:0x01bd, B:205:0x01c3, B:206:0x004e, B:208:0x0054, B:210:0x0062, B:213:0x006e, B:217:0x0088, B:223:0x009d, B:232:0x00a4, B:235:0x00a7, B:239:0x00b5, B:243:0x00cb, B:276:0x00de, B:249:0x00e4, B:254:0x00e7, B:269:0x0163, B:272:0x0160, B:257:0x00f6, B:259:0x00ff, B:261:0x0110, B:263:0x0132), top: B:2:0x0018, inners: #1 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m97276k(C25182u c25182u, C7207s6 c7207s6, C32020m7 c32020m7, int i11, boolean z11, boolean z12, int i12, ColorStateList colorStateList, ColorStateList colorStateList2) {
        String str;
        C22126c0 m130348q1;
        int i13;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        boolean z15;
        int m118669P;
        AbstractC19074t.m100208f(c25182u, "<this>");
        AbstractC19074t.m100208f(c7207s6, "adapter");
        try {
            C7207s6.d dVar = c7207s6.f39501F;
            if ((c32020m7 != null ? c32020m7.f147411b : null) == null) {
                return;
            }
            ContactProfile contactProfile = c32020m7.f147411b;
            if (i11 == 2 || i11 == 10) {
                if ((!AbstractC25495a.m132084i(contactProfile.f42434r) || AbstractC19074t.m100204b(contactProfile.mo2475c(), AbstractC23136l9.m118743r0(AbstractC8020f0.title_strangermsg))) && (!contactProfile.m40372J0() || AbstractC19074t.m100204b(contactProfile.mo2475c(), AbstractC21935u.m114547n()))) {
                    if (contactProfile.f42399a1.isEmpty()) {
                        C22126c0 m130353v1 = c25182u.m130353v1();
                        String m40383Q = contactProfile.m40383Q(true, false);
                        AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
                        int length = m40383Q.length() - 1;
                        int i16 = 0;
                        boolean z16 = false;
                        while (i16 <= length) {
                            boolean z17 = AbstractC19074t.m100209g(m40383Q.charAt(!z16 ? i16 : length), 32) <= 0;
                            if (z16) {
                                if (!z17) {
                                    break;
                                } else {
                                    length--;
                                }
                            } else if (z17) {
                                i16++;
                            } else {
                                z16 = true;
                            }
                        }
                        m130353v1.m111959G1(m40383Q.subSequence(i16, length + 1).toString());
                    } else {
                        String m40383Q2 = contactProfile.m40383Q(true, false);
                        AbstractC19074t.m100207e(m40383Q2, "getDpnPhoneContact(...)");
                        int length2 = m40383Q2.length() - 1;
                        int i17 = 0;
                        boolean z18 = false;
                        while (i17 <= length2) {
                            boolean z19 = AbstractC19074t.m100209g(m40383Q2.charAt(!z18 ? i17 : length2), 32) <= 0;
                            if (z18) {
                                if (!z19) {
                                    break;
                                } else {
                                    length2--;
                                }
                            } else if (z19) {
                                i17++;
                            } else {
                                z18 = true;
                            }
                        }
                        SpannableString spannableString = new SpannableString(m40383Q2.subSequence(i17, length2 + 1).toString());
                        for (int i18 = 0; i18 < contactProfile.f42399a1.size() - 1; i18 += 2) {
                            try {
                                Object obj = contactProfile.f42399a1.get(i18);
                                AbstractC19074t.m100207e(obj, "get(...)");
                                if (((Number) obj).intValue() >= 0) {
                                    int i19 = i18 + 1;
                                    Object obj2 = contactProfile.f42399a1.get(i19);
                                    AbstractC19074t.m100207e(obj2, "get(...)");
                                    int intValue = ((Number) obj2).intValue();
                                    Object obj3 = contactProfile.f42399a1.get(i18);
                                    AbstractC19074t.m100207e(obj3, "get(...)");
                                    if (intValue > ((Number) obj3).intValue()) {
                                        StyleSpan styleSpan = new StyleSpan(1);
                                        Object obj4 = contactProfile.f42399a1.get(i18);
                                        AbstractC19074t.m100207e(obj4, "get(...)");
                                        int intValue2 = ((Number) obj4).intValue();
                                        Object obj5 = contactProfile.f42399a1.get(i19);
                                        AbstractC19074t.m100207e(obj5, "get(...)");
                                        spannableString.setSpan(styleSpan, intValue2, ((Number) obj5).intValue(), 33);
                                    }
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        c25182u.m130353v1().m111959G1(spannableString);
                    }
                }
                c25182u.m130354w1().mo44614b1(8);
                String str2 = "getString(...)";
                if (!TextUtils.isEmpty(contactProfile.f42436r1)) {
                    c25182u.m130356y1().m111959G1(contactProfile.f42436r1);
                    c25182u.m130356y1().mo44614b1(0);
                } else if (!TextUtils.isEmpty(contactProfile.f42439s1)) {
                    c25182u.m130356y1().m111959G1(contactProfile.f42439s1);
                    c25182u.m130356y1().mo44614b1(0);
                } else {
                    int i21 = c32020m7.f147430u;
                    if ((i21 == 1 || i21 == 6 || i21 == 5) && !TextUtils.isEmpty(contactProfile.f42460z1) && AbstractC23309i.m122577xf()) {
                        C22126c0 m130356y1 = c25182u.m130356y1();
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.prefix_username);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{contactProfile.f42460z1}, 1));
                        AbstractC19074t.m100207e(format, "format(...)");
                        m130356y1.m111959G1(format);
                        c25182u.m130356y1().mo44614b1(0);
                    } else {
                        c25182u.m130356y1().mo44614b1(8);
                    }
                }
                if ((AbstractC25495a.m132084i(contactProfile.f42434r) && !AbstractC19074t.m100204b(contactProfile.mo2475c(), AbstractC23136l9.m118743r0(AbstractC8020f0.title_strangermsg))) || (contactProfile.m40372J0() && !AbstractC19074t.m100204b(contactProfile.mo2475c(), AbstractC21935u.m114547n()))) {
                    if (AbstractC25495a.m132084i(contactProfile.f42434r)) {
                        c25182u.m130353v1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.title_strangermsg));
                    } else {
                        c25182u.m130356y1().m111959G1(AbstractC21935u.m114547n());
                    }
                    AbstractC19074t.m100207e(contactProfile.f42399a1, "arrPosToHighlight");
                    if (!r0.isEmpty()) {
                        SpannableString spannableString2 = new SpannableString(contactProfile.mo2475c());
                        int i22 = 0;
                        for (int i23 = 1; i22 < contactProfile.f42399a1.size() - i23; i23 = 1) {
                            try {
                                Object obj6 = contactProfile.f42399a1.get(i22);
                                AbstractC19074t.m100207e(obj6, "get(...)");
                                if (((Number) obj6).intValue() >= 0) {
                                    int i24 = i22 + 1;
                                    Object obj7 = contactProfile.f42399a1.get(i24);
                                    AbstractC19074t.m100207e(obj7, "get(...)");
                                    int intValue3 = ((Number) obj7).intValue();
                                    Object obj8 = contactProfile.f42399a1.get(i22);
                                    AbstractC19074t.m100207e(obj8, "get(...)");
                                    if (intValue3 > ((Number) obj8).intValue()) {
                                        StyleSpan styleSpan2 = new StyleSpan(1);
                                        Object obj9 = contactProfile.f42399a1.get(i22);
                                        AbstractC19074t.m100207e(obj9, "get(...)");
                                        int intValue4 = ((Number) obj9).intValue();
                                        str = str2;
                                        try {
                                            Object obj10 = contactProfile.f42399a1.get(i24);
                                            AbstractC19074t.m100207e(obj10, "get(...)");
                                            spannableString2.setSpan(styleSpan2, intValue4, ((Number) obj10).intValue(), 33);
                                            i22 += 2;
                                            str2 = str;
                                        } catch (Exception e12) {
                                            e = e12;
                                            e.printStackTrace();
                                            c25182u.m130356y1().m111959G1(spannableString2);
                                            c25182u.m130356y1().mo44614b1(0);
                                            if (AbstractC23210s6.f112470b) {
                                            }
                                            m130348q1 = c25182u.m130348q1();
                                            if (m130348q1 == null) {
                                            }
                                        }
                                    }
                                }
                                str = str2;
                                i22 += 2;
                                str2 = str;
                            } catch (Exception e13) {
                                e = e13;
                                str = str2;
                            }
                        }
                        str = str2;
                        c25182u.m130356y1().m111959G1(spannableString2);
                        c25182u.m130356y1().mo44614b1(0);
                        if (AbstractC23210s6.f112470b) {
                            String m40378N = contactProfile.m40378N();
                            AbstractC19074t.m100207e(m40378N, "<get-customMessage>(...)");
                            if (m40378N.length() > 0) {
                                C22126c0 m130348q12 = c25182u.m130348q1();
                                if (m130348q12 != null) {
                                    m130348q12.m111959G1(contactProfile.m40378N());
                                }
                                C22126c0 m130348q13 = c25182u.m130348q1();
                                if (m130348q13 != null) {
                                    m130348q13.mo44614b1(0);
                                }
                                c25182u.m130349r1().f108931U0 = z12;
                                c25182u.m130349r1().m115433q1(contactProfile);
                                String str3 = str;
                                c25182u.m130349r1().mo89109M0(new C16719g.c() { // from class: ea0.c1

                                    /* renamed from: q */
                                    public final /* synthetic */ C25182u f92628q;

                                    /* renamed from: r */
                                    public final /* synthetic */ C7207s6.d f92629r;

                                    /* renamed from: s */
                                    public final /* synthetic */ C32020m7 f92630s;

                                    /* renamed from: t */
                                    public final /* synthetic */ int f92631t;

                                    public /* synthetic */ C18321c1(C25182u c25182u2, C7207s6.d dVar2, C32020m7 c32020m72, int i122) {
                                        r2 = c25182u2;
                                        r3 = dVar2;
                                        r4 = c32020m72;
                                        r5 = i122;
                                    }

                                    @Override // com.zing.zalo.uidrawing.C16719g.c
                                    /* renamed from: y */
                                    public final void mo929y(C16719g c16719g) {
                                        C18333g1.m97277l(ContactProfile.this, r2, r3, r4, r5, c16719g);
                                    }
                                });
                                c25182u2.m130346o1().mo44614b1(8);
                                if (C21927m.m114302u().m114357s().m153137g(contactProfile.f42434r)) {
                                    boolean m40345C0 = ContactProfile.m40345C0(contactProfile.f42352K0);
                                    if (!AbstractC25495a.m132086k(contactProfile.f42434r) && !m40345C0) {
                                        z14 = true;
                                        z15 = false;
                                        m118669P = AbstractC23136l9.m118669P(z15, z14);
                                        if (m118669P == -1) {
                                            c25182u2.m130346o1().mo111926w1(m118669P);
                                            i13 = 0;
                                            c25182u2.m130346o1().mo44614b1(0);
                                        } else {
                                            i13 = 0;
                                            c25182u2.m130346o1().mo44614b1(8);
                                        }
                                    }
                                    z14 = true;
                                    z15 = true;
                                    m118669P = AbstractC23136l9.m118669P(z15, z14);
                                    if (m118669P == -1) {
                                    }
                                } else {
                                    i13 = 0;
                                    if (C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r)) {
                                        c25182u2.m130346o1().mo111926w1(AbstractC16803z.ic_banned);
                                        c25182u2.m130346o1().mo44614b1(0);
                                    }
                                }
                                if (!contactProfile.m40359B0() || contactProfile.m40384Q0()) {
                                    c25182u2.m130346o1().mo111926w1(AbstractC16803z.ic_oa_verify);
                                    c25182u2.m130346o1().mo44614b1(i13);
                                }
                                int i25 = 3;
                                if (c32020m72.f147410a == 13) {
                                    if (AbstractC21935u.m114554u(contactProfile.f42434r)) {
                                        c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg));
                                        c25182u2.m130342B1().mo44614b1(i13);
                                        c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type2_medium);
                                        c25182u2.m130342B1().m111963K1(colorStateList2);
                                    } else if (AbstractC23063f2.m118359k(contactProfile.f42434r)) {
                                        c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg));
                                        c25182u2.m130342B1().mo44614b1(i13);
                                        c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type2_medium);
                                        c25182u2.m130342B1().m111963K1(colorStateList2);
                                    } else {
                                        c32020m72.f147411b.f42373R0 = 41;
                                        c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_add_friend_new));
                                        c25182u2.m130342B1().mo44614b1(i13);
                                        c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type1_medium);
                                        c25182u2.m130342B1().m111963K1(colorStateList);
                                        i15 = 1;
                                        if (dVar2 == null && AbstractC19074t.m100204b(contactProfile.f42434r, dVar2.mo36673CI())) {
                                            c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg));
                                            c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type2_medium);
                                            c25182u2.m130342B1().m111963K1(colorStateList2);
                                            c25182u2.m130342B1().mo44614b1(i13);
                                        } else {
                                            i25 = i15;
                                        }
                                        c25182u2.m130342B1().mo89109M0(new C16719g.c() { // from class: ea0.d1

                                            /* renamed from: q */
                                            public final /* synthetic */ C32020m7 f92635q;

                                            /* renamed from: r */
                                            public final /* synthetic */ int f92636r;

                                            /* renamed from: s */
                                            public final /* synthetic */ int f92637s;

                                            public /* synthetic */ C18324d1(C32020m7 c32020m72, int i122, int i252) {
                                                r2 = c32020m72;
                                                r3 = i122;
                                                r4 = i252;
                                            }

                                            @Override // com.zing.zalo.uidrawing.C16719g.c
                                            /* renamed from: y */
                                            public final void mo929y(C16719g c16719g) {
                                                C18333g1.m97278m(C7207s6.d.this, r2, r3, r4, c16719g);
                                            }
                                        });
                                        if (c25182u2.m130356y1().m89136d0() == 8) {
                                            if (!TextUtils.isEmpty(contactProfile.f42460z1) && AbstractC23148n.m118841o()) {
                                                C22126c0 m130356y12 = c25182u2.m130356y1();
                                                C19067n0 c19067n02 = C19067n0.f94947a;
                                                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.prefix_username);
                                                AbstractC19074t.m100207e(m118743r02, str3);
                                                Object[] objArr = new Object[1];
                                                objArr[i13] = contactProfile.f42460z1;
                                                String format2 = String.format(m118743r02, Arrays.copyOf(objArr, 1));
                                                AbstractC19074t.m100207e(format2, "format(...)");
                                                m130356y12.m111959G1(format2);
                                            } else {
                                                c25182u2.m130356y1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_from_contacts));
                                            }
                                            c25182u2.m130356y1().mo44614b1(i13);
                                        }
                                    }
                                    i15 = 3;
                                    if (dVar2 == null) {
                                    }
                                    i252 = i15;
                                    c25182u2.m130342B1().mo89109M0(new C16719g.c() { // from class: ea0.d1

                                        /* renamed from: q */
                                        public final /* synthetic */ C32020m7 f92635q;

                                        /* renamed from: r */
                                        public final /* synthetic */ int f92636r;

                                        /* renamed from: s */
                                        public final /* synthetic */ int f92637s;

                                        public /* synthetic */ C18324d1(C32020m7 c32020m72, int i122, int i252) {
                                            r2 = c32020m72;
                                            r3 = i122;
                                            r4 = i252;
                                        }

                                        @Override // com.zing.zalo.uidrawing.C16719g.c
                                        /* renamed from: y */
                                        public final void mo929y(C16719g c16719g) {
                                            C18333g1.m97278m(C7207s6.d.this, r2, r3, r4, c16719g);
                                        }
                                    });
                                    if (c25182u2.m130356y1().m89136d0() == 8) {
                                    }
                                } else {
                                    if (i11 != 10 && !z11) {
                                        c25182u2.m130342B1().mo44614b1(8);
                                    }
                                    if (contactProfile.f42352K0 == 0) {
                                        int i26 = contactProfile.f42376S0;
                                        if (i26 == 1) {
                                            if (AbstractC23063f2.m118359k(contactProfile.f42434r)) {
                                                c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg));
                                                c25182u2.m130342B1().mo44614b1(i13);
                                                c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type2_medium);
                                                c25182u2.m130342B1().m111963K1(colorStateList2);
                                                i14 = 3;
                                            } else {
                                                c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_add_friend_new));
                                                c25182u2.m130342B1().mo44614b1(i13);
                                                c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type1_medium);
                                                c25182u2.m130342B1().m111963K1(colorStateList);
                                                i14 = 1;
                                            }
                                        } else if (i26 == 2) {
                                            c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_accept_friend));
                                            c25182u2.m130342B1().mo44614b1(i13);
                                            c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type1_medium);
                                            c25182u2.m130342B1().m111963K1(colorStateList);
                                            i14 = 0;
                                        } else {
                                            if (!AbstractC19074t.m100204b(contactProfile.f42434r, CoreUtility.f89233i)) {
                                                if (AbstractC21935u.m114554u(contactProfile.f42434r)) {
                                                    if (i11 == 10) {
                                                        c25182u2.m130342B1().mo44614b1(8);
                                                    } else {
                                                        c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg));
                                                        c25182u2.m130342B1().mo44614b1(i13);
                                                        c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type2_medium);
                                                        c25182u2.m130342B1().m111963K1(colorStateList2);
                                                    }
                                                } else if (AbstractC23063f2.m118359k(contactProfile.f42434r)) {
                                                    c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg));
                                                    c25182u2.m130342B1().mo44614b1(i13);
                                                    c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type2_medium);
                                                    c25182u2.m130342B1().m111963K1(colorStateList2);
                                                } else {
                                                    c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_add_friend_new));
                                                    c25182u2.m130342B1().mo44614b1(i13);
                                                    c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type1_medium);
                                                    c25182u2.m130342B1().m111963K1(colorStateList);
                                                    i14 = 1;
                                                }
                                                i14 = 3;
                                            }
                                            i14 = -1;
                                        }
                                        if (AbstractC19074t.m100204b(contactProfile.f42434r, CoreUtility.f89233i)) {
                                            c25182u2.m130342B1().mo44614b1(8);
                                        }
                                    } else if (C21927m.m114302u().m114318P(contactProfile.f42434r)) {
                                        c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_flow_oa_action));
                                        c25182u2.m130342B1().mo44614b1(i13);
                                        c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type2_medium);
                                        c25182u2.m130342B1().m111963K1(colorStateList2);
                                        i14 = 3;
                                    } else {
                                        c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_follow_page));
                                        c25182u2.m130342B1().mo44614b1(i13);
                                        c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type2_medium);
                                        c25182u2.m130342B1().m111963K1(colorStateList2);
                                        i14 = 2;
                                    }
                                    if (dVar2 == null || !AbstractC19074t.m100204b(contactProfile.f42434r, dVar2.mo36673CI())) {
                                        i252 = i14;
                                    } else {
                                        if (contactProfile.f42352K0 <= 0 && !C21927m.m114302u().m114318P(contactProfile.f42434r)) {
                                            c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg));
                                            c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type2_medium);
                                            c25182u2.m130342B1().m111963K1(colorStateList2);
                                            c25182u2.m130342B1().mo44614b1(i13);
                                        }
                                        c25182u2.m130342B1().m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_flow_oa_action));
                                        c25182u2.m130342B1().m89087B0(AbstractC16803z.bg_btn_type2_medium);
                                        c25182u2.m130342B1().m111963K1(colorStateList2);
                                        c25182u2.m130342B1().mo44614b1(i13);
                                    }
                                    c25182u2.m130342B1().mo89109M0(new C16719g.c() { // from class: ea0.e1

                                        /* renamed from: q */
                                        public final /* synthetic */ C32020m7 f92646q;

                                        /* renamed from: r */
                                        public final /* synthetic */ int f92647r;

                                        /* renamed from: s */
                                        public final /* synthetic */ int f92648s;

                                        public /* synthetic */ C18327e1(C32020m7 c32020m72, int i122, int i252) {
                                            r2 = c32020m72;
                                            r3 = i122;
                                            r4 = i252;
                                        }

                                        @Override // com.zing.zalo.uidrawing.C16719g.c
                                        /* renamed from: y */
                                        public final void mo929y(C16719g c16719g) {
                                            C18333g1.m97279n(C7207s6.d.this, r2, r3, r4, c16719g);
                                        }
                                    });
                                    if (i252 == -1) {
                                        c25182u2.m130342B1().mo44614b1(8);
                                    }
                                    if (c32020m72.f147411b.f42370Q0) {
                                        z13 = false;
                                    } else {
                                        c25182u2.m130357z1().m89087B0(AbstractC16803z.ic_ads_tag_bg);
                                        c25182u2.m130341A1().m111958F1(AbstractC8020f0.str_profile_side_tagline_ads);
                                        c25182u2.m130341A1().m111962J1(c25182u2.m130343C1());
                                        c25182u2.m130341A1().mo111964L1(AbstractC23136l9.m118742r(11.0f));
                                        int m118742r = AbstractC23136l9.m118742r(5.0f);
                                        int m118742r2 = AbstractC23136l9.m118742r(2.0f);
                                        c25182u2.m130341A1().m89106L().m89032P(m118742r, m118742r2, m118742r, m118742r2);
                                        z13 = true;
                                    }
                                    c25182u2.m130345E1(z13);
                                }
                                if (c32020m72.f147411b.f42370Q0) {
                                }
                                c25182u2.m130345E1(z13);
                            }
                        }
                        m130348q1 = c25182u2.m130348q1();
                        if (m130348q1 == null) {
                            c25182u2.m130349r1().f108931U0 = z12;
                            c25182u2.m130349r1().m115433q1(contactProfile);
                            String str32 = str;
                            c25182u2.m130349r1().mo89109M0(new C16719g.c() { // from class: ea0.c1

                                /* renamed from: q */
                                public final /* synthetic */ C25182u f92628q;

                                /* renamed from: r */
                                public final /* synthetic */ C7207s6.d f92629r;

                                /* renamed from: s */
                                public final /* synthetic */ C32020m7 f92630s;

                                /* renamed from: t */
                                public final /* synthetic */ int f92631t;

                                public /* synthetic */ C18321c1(C25182u c25182u2, C7207s6.d dVar2, C32020m7 c32020m72, int i122) {
                                    r2 = c25182u2;
                                    r3 = dVar2;
                                    r4 = c32020m72;
                                    r5 = i122;
                                }

                                @Override // com.zing.zalo.uidrawing.C16719g.c
                                /* renamed from: y */
                                public final void mo929y(C16719g c16719g) {
                                    C18333g1.m97277l(ContactProfile.this, r2, r3, r4, r5, c16719g);
                                }
                            });
                            c25182u2.m130346o1().mo44614b1(8);
                            if (C21927m.m114302u().m114357s().m153137g(contactProfile.f42434r)) {
                            }
                            if (!contactProfile.m40359B0()) {
                            }
                            c25182u2.m130346o1().mo111926w1(AbstractC16803z.ic_oa_verify);
                            c25182u2.m130346o1().mo44614b1(i13);
                            int i252 = 3;
                            if (c32020m72.f147410a == 13) {
                            }
                            if (c32020m72.f147411b.f42370Q0) {
                            }
                            c25182u2.m130345E1(z13);
                        } else {
                            m130348q1.mo44614b1(8);
                            c25182u2.m130349r1().f108931U0 = z12;
                            c25182u2.m130349r1().m115433q1(contactProfile);
                            String str322 = str;
                            c25182u2.m130349r1().mo89109M0(new C16719g.c() { // from class: ea0.c1

                                /* renamed from: q */
                                public final /* synthetic */ C25182u f92628q;

                                /* renamed from: r */
                                public final /* synthetic */ C7207s6.d f92629r;

                                /* renamed from: s */
                                public final /* synthetic */ C32020m7 f92630s;

                                /* renamed from: t */
                                public final /* synthetic */ int f92631t;

                                public /* synthetic */ C18321c1(C25182u c25182u2, C7207s6.d dVar2, C32020m7 c32020m72, int i122) {
                                    r2 = c25182u2;
                                    r3 = dVar2;
                                    r4 = c32020m72;
                                    r5 = i122;
                                }

                                @Override // com.zing.zalo.uidrawing.C16719g.c
                                /* renamed from: y */
                                public final void mo929y(C16719g c16719g) {
                                    C18333g1.m97277l(ContactProfile.this, r2, r3, r4, r5, c16719g);
                                }
                            });
                            c25182u2.m130346o1().mo44614b1(8);
                            if (C21927m.m114302u().m114357s().m153137g(contactProfile.f42434r)) {
                            }
                            if (!contactProfile.m40359B0()) {
                            }
                            c25182u2.m130346o1().mo111926w1(AbstractC16803z.ic_oa_verify);
                            c25182u2.m130346o1().mo44614b1(i13);
                            int i2522 = 3;
                            if (c32020m72.f147410a == 13) {
                            }
                            if (c32020m72.f147411b.f42370Q0) {
                            }
                            c25182u2.m130345E1(z13);
                        }
                    }
                }
                str = "getString(...)";
                if (AbstractC23210s6.f112470b) {
                }
                m130348q1 = c25182u2.m130348q1();
                if (m130348q1 == null) {
                }
            }
            C16719g m130347p1 = c25182u2.m130347p1();
            if (m130347p1 == null) {
                return;
            }
            m130347p1.mo44614b1(8);
        } catch (Exception e14) {
            e14.printStackTrace();
        }
    }

    /* renamed from: l */
    public static final void m97277l(ContactProfile contactProfile, C25182u c25182u, C7207s6.d dVar, C32020m7 c32020m7, int i11, C16719g c16719g) {
        AbstractC19074t.m100208f(c25182u, "$this_bindLegacySearchItem");
        if (!contactProfile.m40374K0() && AbstractC22055v0.m115114D(contactProfile.f42434r, AbstractC21244b.m110054d(c25182u.getContext()))) {
            if (dVar != null) {
                dVar.mo36678Pl(c32020m7, i11, null);
            }
        } else if (dVar != null) {
            dVar.mo36675F9(c32020m7, i11, false, true, true);
        }
    }

    /* renamed from: m */
    public static final void m97278m(C7207s6.d dVar, C32020m7 c32020m7, int i11, int i12, C16719g c16719g) {
        if (dVar != null) {
            dVar.mo36674Dr(c32020m7, i11, i12, false);
        }
    }

    /* renamed from: n */
    public static final void m97279n(C7207s6.d dVar, C32020m7 c32020m7, int i11, int i12, C16719g c16719g) {
        if (dVar != null) {
            dVar.mo36674Dr(c32020m7, i11, i12, false);
        }
    }

    /* renamed from: p */
    public static final void m97280p() {
        try {
            if (AbstractC23309i.m122319qg()) {
                C22021e0.m114963p().m114973E();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s */
    public static final void m97281s(Intent intent, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$onSuccessAction");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("extra_selected_profiles");
        if (stringArrayListExtra == null) {
            return;
        }
        C23024b7.f111993a.m118056R(stringArrayListExtra);
        AbstractC19444a.m101695c(new Runnable() { // from class: ea0.f1
            public /* synthetic */ RunnableC18330f1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18333g1.m97282t(InterfaceC18494a.this);
            }
        });
    }

    /* renamed from: t */
    public static final void m97282t(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$tmp0");
        interfaceC18494a.mo12V4();
    }

    /* renamed from: w */
    public static /* synthetic */ void m97283w(C18333g1 c18333g1, ZaloView zaloView, String str, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        c18333g1.m97298v(zaloView, str, i11);
    }

    /* renamed from: A */
    public final C8009j m97284A(ZaloView zaloView, List list, InterfaceC18505l interfaceC18505l) {
        HashMap m131406k;
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(list, "list");
        AbstractC19074t.m100208f(interfaceC18505l, "onPopUpClickAction");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            try {
                C24861r.a aVar = C24861r.f119264q;
                m131406k = AbstractC25363p0.m131406k(AbstractC24866w.m129235a("name", AbstractC23136l9.m118743r0(intValue)), AbstractC24866w.m129235a("id", Integer.valueOf(intValue)));
                C24861r.m129218b(Boolean.valueOf(arrayList.add(m131406k)));
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(zaloView.f88762c0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j.a aVar3 = new C8009j.a(zaloView.f88762c0.m92648SI());
        aVar3.m43155d(true);
        aVar3.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: ea0.x0

            /* renamed from: p */
            public final /* synthetic */ SimpleAdapter f92731p;

            /* renamed from: q */
            public final /* synthetic */ InterfaceC18505l f92732q;

            public /* synthetic */ C18367x0(SimpleAdapter simpleAdapter2, InterfaceC18505l interfaceC18505l2) {
                r1 = simpleAdapter2;
                r2 = interfaceC18505l2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C18333g1.m97264B(r1, r2, interfaceC17463d, i11);
            }
        });
        C8009j m43152a = aVar3.m43152a();
        AbstractC19074t.m100207e(m43152a, "create(...)");
        if (!m43152a.m92868m()) {
            m43152a.mo13822K();
        }
        return m43152a;
    }

    /* renamed from: C */
    public final void m97285C(ZaloView zaloView, List list) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(list, "quickAccessList");
        Bundle m7340a = AbstractC1438d.m7340a();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        m7340a.putString("STR_SOURCE_START_VIEW", "global_search");
        m7340a.putBoolean("extra_show_selected_number", true);
        m7340a.putInt("extra_max_pick_count", 4);
        m7340a.putStringArrayList("EXTRA_PRESELECT_UID_LIST", arrayList);
        m7340a.putBoolean("EXTRA_ALLOW_SUBMIT_EMPTY", true);
        C17487o0 m92662fJ = zaloView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(QuickAccessContactPickerView.class, m7340a, 10010, 1, true);
        }
    }

    /* renamed from: D */
    public final void m97286D(C18338j c18338j) {
        AbstractC19074t.m100208f(c18338j, "adapter");
        try {
            C24861r.a aVar = C24861r.f119264q;
            Iterator it = c18338j.m97311y().iterator();
            while (it.hasNext()) {
                ((SearchGlobalResultPageLayout) it.next()).getAdapter().m10008p();
            }
            C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
    }

    /* renamed from: E */
    public final void m97287E(C18328f c18328f, MessageId messageId) {
        AbstractC19074t.m100208f(c18328f, "adapter");
        AbstractC19074t.m100208f(messageId, "messageId");
        try {
            C24861r.a aVar = C24861r.f119264q;
            m97288F(c18328f, messageId);
            C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: ea0.y0.<init>(int, int, ea0.f):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: F */
    public final void m97288F(ea0.C18328f r12, com.zing.zalo.data.entity.chat.message.MessageId r13) {
        /*
            r11 = this;
            java.lang.String r0 = "adapter"
            fn0.AbstractC19074t.m100208f(r12, r0)
            java.lang.String r0 = "messageId"
            fn0.AbstractC19074t.m100208f(r13, r0)
            pm0.r$a r0 = pm0.C24861r.f119264q     // Catch: java.lang.Throwable -> L2c
            int r0 = r12.mo10003k()     // Catch: java.lang.Throwable -> L2c
            java.util.List r1 = r12.m97242L()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c
            r2 = 0
        L19:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L71
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L2c
            wk.a r3 = (p612wk.AbstractC29069a) r3     // Catch: java.lang.Throwable -> L2c
            boolean r4 = r3 instanceof p612wk.AbstractC29069a.a     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L2e
            wk.a$a r3 = (p612wk.AbstractC29069a.a) r3     // Catch: java.lang.Throwable -> L2c
            goto L2f
        L2c:
            r12 = move-exception
            goto L80
        L2e:
            r3 = 0
        L2f:
            if (r3 == 0) goto L6e
            com.zing.zalo.data.entity.chat.message.MessageId$a r4 = com.zing.zalo.data.entity.chat.message.MessageId.Companion     // Catch: java.lang.Throwable -> L2c
            cj.p r5 = r3.m145142f()     // Catch: java.lang.Throwable -> L2c
            cj.u r5 = r5.m18037d()     // Catch: java.lang.Throwable -> L2c
            long r5 = r5.m18052a()     // Catch: java.lang.Throwable -> L2c
            cj.p r7 = r3.m145142f()     // Catch: java.lang.Throwable -> L2c
            cj.u r7 = r7.m18037d()     // Catch: java.lang.Throwable -> L2c
            long r7 = r7.m18053b()     // Catch: java.lang.Throwable -> L2c
            cj.p r9 = r3.m145142f()     // Catch: java.lang.Throwable -> L2c
            cj.u r9 = r9.m18037d()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r9 = r9.m18055d()     // Catch: java.lang.Throwable -> L2c
            cj.p r3 = r3.m145142f()     // Catch: java.lang.Throwable -> L2c
            cj.u r3 = r3.m18037d()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r10 = r3.m18056e()     // Catch: java.lang.Throwable -> L2c
            com.zing.zalo.data.entity.chat.message.MessageId r3 = r4.m41065d(r5, r7, r9, r10)     // Catch: java.lang.Throwable -> L2c
            boolean r3 = fn0.AbstractC19074t.m100204b(r13, r3)     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L6e
            goto L72
        L6e:
            int r2 = r2 + 1
            goto L19
        L71:
            r2 = -1
        L72:
            ea0.y0 r13 = new ea0.y0     // Catch: java.lang.Throwable -> L2c
            r13.<init>()     // Catch: java.lang.Throwable -> L2c
            gg0.AbstractC19444a.m101697e(r13)     // Catch: java.lang.Throwable -> L2c
            pm0.g0 r12 = pm0.C24848g0.f119245a     // Catch: java.lang.Throwable -> L2c
            pm0.C24861r.m129218b(r12)     // Catch: java.lang.Throwable -> L2c
            goto L89
        L80:
            pm0.r$a r13 = pm0.C24861r.f119264q
            java.lang.Object r12 = pm0.AbstractC24862s.m129227a(r12)
            pm0.C24861r.m129218b(r12)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ea0.C18333g1.m97288F(ea0.f, com.zing.zalo.data.entity.chat.message.MessageId):void");
    }

    /* renamed from: H */
    public final void m97289H(C18328f c18328f, String str) {
        Object m129218b;
        Iterable m131194T0;
        AbstractC29069a.o oVar;
        InterfaceC0861a m145198e;
        AbstractC19074t.m100208f(c18328f, "adapter");
        AbstractC19074t.m100208f(str, "uid");
        try {
            C24861r.a aVar = C24861r.f119264q;
            m131194T0 = AbstractC25332a0.m131194T0(c18328f.m97242L());
            ArrayList arrayList = new ArrayList();
            for (Object obj : m131194T0) {
                Object m131264b = ((C25345g0) obj).m131264b();
                String str2 = null;
                if (m131264b instanceof AbstractC29069a.o) {
                    oVar = (AbstractC29069a.o) m131264b;
                } else {
                    oVar = null;
                }
                if (oVar != null && (m145198e = oVar.m145198e()) != null) {
                    str2 = m145198e.mo2478b();
                }
                if (AbstractC19074t.m100204b(str2, str)) {
                    arrayList.add(obj);
                }
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: ea0.z0

                /* renamed from: p */
                public final /* synthetic */ List f92740p;

                /* renamed from: q */
                public final /* synthetic */ C18328f f92741q;

                public /* synthetic */ RunnableC18371z0(List arrayList2, C18328f c18328f2) {
                    r1 = arrayList2;
                    r2 = c18328f2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18333g1.m97266J(r1, r2);
                }
            });
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            AbstractC20110a.f98889a.mo104552e(m129221e);
        }
    }

    /* renamed from: I */
    public final void m97290I(C18338j c18338j, String str) {
        Object m129218b;
        AbstractC19074t.m100208f(c18338j, "adapter");
        AbstractC19074t.m100208f(str, "uid");
        try {
            C24861r.a aVar = C24861r.f119264q;
            Iterator it = c18338j.m97311y().iterator();
            while (it.hasNext()) {
                m97289H(((SearchGlobalResultPageLayout) it.next()).getAdapter(), str);
            }
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            AbstractC20110a.f98889a.mo104552e(m129221e);
        }
    }

    /* renamed from: K */
    public final void m97291K(ZaloView zaloView, String str, MessageId messageId, Integer num, String str2) {
        Object m129218b;
        C24848g0 c24848g0;
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(messageId, "messageId");
        try {
            C24861r.a aVar = C24861r.f119264q;
            Bundle m140776b = new C27870vb(str).m140781h(messageId).m140776b();
            if (str2 != null) {
                m140776b.putString("search_message", str2);
            }
            if (num != null) {
                num.intValue();
                m140776b.putInt("extra_global_search_click_count", num.intValue());
            }
            InterfaceC27218a m92676n2 = zaloView.m92676n2();
            if (m92676n2 != null) {
                m92676n2.mo35573l4(ChatView.class, m140776b, 1, true);
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            m129218b = C24861r.m129218b(c24848g0);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            m129221e.printStackTrace();
        }
    }

    /* renamed from: L */
    public final void m97292L(ZaloView zaloView, C26365a c26365a, int i11) {
        InterfaceC27218a interfaceC27218a;
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(c26365a, "profileParam");
        C19171b c19171b = new C19171b();
        C17487o0 m92662fJ = zaloView.m92662fJ();
        if (m92662fJ != null) {
            interfaceC27218a = m92662fJ.m93021N0();
        } else {
            interfaceC27218a = null;
        }
        c19171b.m101508a(new C19171b.a(interfaceC27218a, c26365a, i11, 1));
    }

    /* renamed from: j */
    public final void m97293j(C16719g c16719g, int i11, AbstractC29069a abstractC29069a, AbstractC29080l abstractC29080l) {
        C26723b.a m137448e;
        AbstractC19074t.m100208f(abstractC29069a, "data");
        if (c16719g != null) {
            boolean m100204b = AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.a.f134882b);
            C26723b m145138a = abstractC29069a.m145138a();
            if (!m100204b) {
                m137448e = m145138a.m137446c();
            } else {
                m137448e = m145138a.m137448e();
            }
            int i12 = 0;
            if (AbstractC19074t.m100204b(m137448e, C26723b.a.C32983a.f126747a)) {
                c16719g.m89106L().m89034R(i11);
            } else if (AbstractC19074t.m100204b(m137448e, C26723b.a.c.f126749a)) {
                i12 = 8;
            } else if (AbstractC19074t.m100204b(m137448e, C26723b.a.b.f126748a)) {
                c16719g.m89106L().m89034R(0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            c16719g.mo44614b1(i12);
        }
    }

    /* renamed from: o */
    public final void m97294o() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.a1
            @Override // java.lang.Runnable
            public final void run() {
                C18333g1.m97280p();
            }
        });
    }

    /* renamed from: q */
    public final void m97295q(ZaloView zaloView, String str) {
        Object obj;
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(str, "text");
        Context m92648SI = zaloView.m92648SI();
        ClipboardManager clipboardManager = null;
        if (m92648SI != null) {
            obj = m92648SI.getSystemService("clipboard");
        } else {
            obj = null;
        }
        if (obj instanceof ClipboardManager) {
            clipboardManager = (ClipboardManager) obj;
        }
        if (clipboardManager != null) {
            C0012a c0012a = new C0012a(clipboardManager, new SensitiveData("clipboard_access_text_global_search", "global_search", null, 4, null));
            ClipData newPlainText = ClipData.newPlainText(str, str);
            AbstractC19074t.m100207e(newPlainText, "newPlainText(...)");
            c0012a.m16c(newPlainText);
        }
    }

    /* renamed from: r */
    public final void m97296r(Intent intent, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "onSuccessAction");
        if (intent == null) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.b1

            /* renamed from: p */
            public final /* synthetic */ Intent f92620p;

            /* renamed from: q */
            public final /* synthetic */ InterfaceC18494a f92621q;

            public /* synthetic */ RunnableC18318b1(Intent intent2, InterfaceC18494a interfaceC18494a2) {
                r1 = intent2;
                r2 = interfaceC18494a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18333g1.m97281s(r1, r2);
            }
        });
    }

    /* renamed from: u */
    public final void m97297u(ZaloView zaloView, C20556f c20556f) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(c20556f, "fileWrapper");
        try {
            AbstractC23152n3.m119036c0(zaloView.m92648SI(), c20556f);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: v */
    public final void m97298v(ZaloView zaloView, String str, int i11) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        InterfaceC27218a m92676n2 = zaloView.m92676n2();
        if (m92676n2 != null) {
            ZaloWebView.Companion.m87172G(m92676n2, str, new Bundle(), i11);
        }
    }

    /* renamed from: x */
    public final void m97299x(ZaloView zaloView, String str, AbstractC29080l abstractC29080l, AbstractC29076h abstractC29076h, String str2, String str3, int i11, long j11, int i12) {
        int i13;
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(str, "textSearch");
        AbstractC19074t.m100208f(str2, "ownerId");
        AbstractC19074t.m100208f(str3, "ownerDisplayName");
        Bundle bundle = new Bundle();
        bundle.putString("TEXT_SEARCH", str);
        int i14 = 0;
        if (abstractC29080l != null) {
            i13 = abstractC29080l.m145312a();
        } else {
            i13 = 0;
        }
        bundle.putInt("TAB_TYPE", i13);
        if (abstractC29076h != null) {
            i14 = abstractC29076h.m145259a();
        }
        bundle.putInt("SECTION_TYPE", i14);
        bundle.putString("OWNER_UID", str2);
        bundle.putString("OWNER_DISPLAY_NAME", str3);
        bundle.putInt("FILTER_FLAGS", i11);
        bundle.putLong("SEARCH_START_SESSION_TIME", j11);
        bundle.putInt("SEARCH_MESSAGE_ITEM_CLICK_COUNT", i12);
        InterfaceC27218a m92676n2 = zaloView.m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(SearchGlobalSubScreenView.class, bundle, 1, true);
        }
    }

    /* renamed from: y */
    public final void m97300y(AbstractRunnableC28185s6.b bVar, String str, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(bVar, "itemView");
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        new a(bVar, interfaceC18505l, Collections.singletonList(str)).m141750b();
    }

    /* renamed from: z */
    public final void m97301z(ZaloView zaloView, AbstractC29069a abstractC29069a, AbstractC3552t abstractC3552t) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(abstractC29069a, "data");
        AbstractC19074t.m100208f(abstractC3552t, "media");
        if ((abstractC29069a instanceof AbstractC29069a.a) && !(abstractC3552t instanceof C3549q) && (abstractC3552t instanceof C3551s)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("bol_share_in_app", true);
            C3551s c3551s = (C3551s) abstractC3552t;
            bundle.putString("linktoShare", c3551s.m18051f());
            bundle.putString("subjectForLink", c3551s.m18050e());
            bundle.putString("STR_LOG_CHAT_TYPE", "0");
            bundle.putString("STR_SOURCE_START_VIEW", "chat_storedmedia");
            InterfaceC27218a m92676n2 = zaloView.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93069k2(ShareView.class, bundle, 1, true);
            }
        }
    }
}
