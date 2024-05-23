package p588vw;

import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import androidx.emoji2.text.C1698f;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.AbstractC13560a;
import com.zing.zalo.p077ui.widget.C13632f0;
import com.zing.zalo.p077ui.widget.C13637g0;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.uicontrol.svg.C16654c;
import dd0.C17890c;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import p173fz.C19172a;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p392oh.C24265l;
import p588vw.C28652r;
import p716zh.C31949hb;
import p716zh.C31957i4;
import p716zh.C31972j4;
import p716zh.C32014m1;
import th.AbstractC26683d;
import vg.AbstractC28236y3;
import vg.AbstractC28245z3;
import vg.C28050e3;
import vg.C28211v5;

/* renamed from: vw.r */
/* loaded from: classes.dex */
public final class C28652r {

    /* renamed from: A */
    public static final int f132823A;

    /* renamed from: q */
    public static boolean f132825q = false;

    /* renamed from: r */
    public static boolean f132826r = false;

    /* renamed from: s */
    public static boolean f132827s = false;

    /* renamed from: t */
    private static Bitmap f132828t;

    /* renamed from: z */
    private static final String[][] f132834z;

    /* renamed from: a */
    final Map f132835a;

    /* renamed from: b */
    final Map f132836b;

    /* renamed from: c */
    final Map f132837c;

    /* renamed from: d */
    final Map f132838d;

    /* renamed from: e */
    private final ArrayList f132839e;

    /* renamed from: f */
    private final Set f132840f;

    /* renamed from: g */
    private final Set f132841g;

    /* renamed from: h */
    final Pattern f132842h;

    /* renamed from: i */
    Pattern f132843i;

    /* renamed from: j */
    private boolean f132844j;

    /* renamed from: k */
    public final ArrayList f132845k;

    /* renamed from: l */
    private final ArrayList f132846l;

    /* renamed from: m */
    private float f132847m;

    /* renamed from: n */
    public boolean f132848n;

    /* renamed from: o */
    public int f132849o;

    /* renamed from: p */
    public boolean f132850p;

    /* renamed from: u */
    public static final String[] f132829u = {":)", ":~", ":B", ":')", "8-)", ":-((", ":$", ":3", ":Z", ":((", "&-(", ":-H", ":P", ":D", ":O", ":(", ";-)", "--B", ":))", ":-*", ";P", ";-D", "/-showlove", ";D", ";O", ";G", "|-)", ":!", ":L", ":>", ":;", ";F", ":V", ":WIPE", ":-DIG", ":handclap", "B-)", ":-R", ":-<", ":-O", ";-S", ";?", ";-X", ":-F", "8*)", ";!", ";-!", ";XX", ":-BYE", ">-|", "P-(", ":--|", ":Q", "X-)", ":*", ";-A", "8*", ":|", ":X", ":T", ";-/", ":-L", "$-)", "/-beer", "/-coffee", "/-rose", "/-fade", "/-bd", "/-bome", "/-cake", "/-heart", "/-break", "/-shit", "/-li", "/-flag", "/-strong", "/-weak", "/-ok", "/-v", "/-thanks", "/-punch", "/-share", "_()_", "/-no", "/-bad", "/-loveu", ":-|", ":+", ";8", "/-jj"};

    /* renamed from: v */
    public static final String[] f132830v = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* renamed from: w */
    public static final String[] f132831w = {"💋", "👄", "👀", "👻", "💛", "💙", "💜", "💚", "💔", "👊", "👋", "👐", "🙌", "💪", "👏", "🐶", "🐺", "🐱", "🐭", "🐹", "🐰", "🐯", "🐨", "🐷", "🐮", "🐵", "🐴", "🐑", "🐘", "🐥", "🐔", "🐍", "🐓", "🐲", "🌻", "🍂", "🎄", "🌳", "🌞", "🌝", "🌙", "🔥", "💧", "🌟", "⭐️", "⚡️", "☔️", "⛄️", "🌈", "🍼", "🍻", "🍸", "🍹", "🍷", "🍴", "🍔", "🍗", "🍕", "🍚", "🍜", "🍳", "🍞", "🍩", "🍦", "🍨", "🍧", "🎂", "🍰", "🍫", "🍭", "🍌", "🍆", "🌽", "🎲", "🎯", "🏀️", "⚽️", "⚾️", "🎱", "🎳", "🚴", "🏇", "🏆", "🏊", "🏄", "🎣", "🎤", "🎧", "🎵", "🎶", "🎻", "🎷", "🎸", "🎹", "⛵️", "🚀", "✈️", "🚁", "🚂", "🚃", "🚘", "🚕", "🚨", "🚓", "🚒", "🚲", "🗼", "⛺️", "🎒", "🎓", "🎃", "🎁", "🎉", "🎈", "📷", "💻", "📱", "☎️", "🔔", "⏰", "🔑", "🔦", "🚽", "💣", "🔪", "💊", "💰", "💸", "📅", "✂️", "✏️", "📕", "📖", "🔭", "🎨", "👓", "💄", "💍", "💎", "👙", "⛽️"};

    /* renamed from: x */
    private static final int[] f132832x = {AbstractC16803z.emoji_people_focus, AbstractC16803z.emoji_nature_focus, AbstractC16803z.emoji_travel_focus, AbstractC16803z.emoji_objects_focus, AbstractC16803z.emoji_symbols_focus, AbstractC16803z.emoji_food_focus, AbstractC16803z.emoji_activity_focus, AbstractC16803z.emoji_flags_focus};

    /* renamed from: y */
    private static final int[] f132833y = {AbstractC23322a.zds_ic_face_smile_line_24, AbstractC23322a.zds_ic_user_line_24, AbstractC23322a.zds_ic_bear_line_24, AbstractC23322a.zds_ic_bread_line_24, AbstractC23322a.zds_ic_car_line_24, AbstractC23322a.zds_ic_football_line_24, AbstractC23322a.zds_ic_light_bulb_line_24, AbstractC23322a.zds_ic_hashtag_square_line_24, AbstractC23322a.zds_ic_flag_line_24};

    /* renamed from: B */
    private static final C32014m1 f132824B = new C32014m1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vw.r$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f132851a;

        a(String str) {
            this.f132851a = str;
        }

        /* renamed from: d */
        public static /* synthetic */ void m143387d() {
            C23744a.m124114c().m124116d(8003, new Object[0]);
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                JSONArray jSONArray = new JSONArray();
                synchronized (C28652r.this.f132840f) {
                    try {
                        C28652r.this.f132840f.remove(this.f132851a);
                        Iterator it = C28652r.this.f132840f.iterator();
                        while (it.hasNext() && C28652r.this.f132840f.size() >= 7) {
                            it.next();
                            it.remove();
                        }
                        C28652r.this.f132840f.add(this.f132851a);
                        Iterator it2 = C28652r.this.f132840f.iterator();
                        while (it2.hasNext()) {
                            jSONArray.put((String) it2.next());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                AbstractC23309i.m122627ys(jSONArray.toString());
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: vw.q
                @Override // java.lang.Runnable
                public final void run() {
                    C28652r.a.m143387d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vw.r$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f132853a;

        b(String str) {
            this.f132853a = str;
        }

        /* renamed from: d */
        public static /* synthetic */ void m143389d() {
            C23744a.m124114c().m124116d(8003, new Object[0]);
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                JSONArray jSONArray = new JSONArray();
                synchronized (C28652r.this.f132841g) {
                    try {
                        C28652r.this.f132841g.remove(this.f132853a);
                        Iterator it = C28652r.this.f132841g.iterator();
                        while (it.hasNext() && C28652r.this.f132841g.size() >= 7) {
                            it.next();
                            it.remove();
                        }
                        C28652r.this.f132841g.add(this.f132853a);
                        Iterator it2 = C28652r.this.f132841g.iterator();
                        while (it2.hasNext()) {
                            jSONArray.put((String) it2.next());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                AbstractC0924m0.m3904ii(jSONArray.toString());
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: vw.s
                @Override // java.lang.Runnable
                public final void run() {
                    C28652r.b.m143389d();
                }
            });
        }
    }

    /* renamed from: vw.r$c */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a */
        public int f132855a;

        /* renamed from: b */
        public int f132856b = 0;

        /* renamed from: c */
        public List f132857c = new ArrayList();

        /* renamed from: d */
        public String f132858d = "";

        /* renamed from: e */
        public String f132859e = "";

        /* renamed from: f */
        public boolean f132860f = false;

        /* renamed from: g */
        public boolean f132861g = false;

        public c(int i11) {
            this.f132855a = 1;
            this.f132855a = i11;
        }
    }

    /* renamed from: vw.r$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public static C28652r f132862a = new C28652r();

        static {
            C28652r.f132825q = true;
            if (C28652r.f132826r) {
                C28652r.f132826r = false;
                C23744a.m124114c().m124116d(36, new Object[0]);
            }
        }
    }

    static {
        String[][] strArr = {new String[]{"☺", "😊", "😀", "😁", "😂", "😃", "😄", "😅", "😆", "😇", "😈", "😉", "😯", "😐", "😑", "😕", "😠", "😬", "😡", "😢", "😴", "😮", "😣", "😤", "😥", "😦", "😧", "😨", "😩", "😰", "😟", "😱", "😲", "😳", "😵", "😶", "😷", "😞", "😒", "😍", "😛", "😜", "😝", "😋", "😗", "😙", "😘", "😚", "😎", "😭", "😌", "😖", "😔", "😪", "😏", "😓", "😫", "🙋", "🙌", "🙍", "🙅", "🙆", "🙇", "🙎", "🙏", "😺", "😼", "😸", "😹", "😻", "😽", "😿", "😾", "🙀", "🙈", "🙉", "🙊", "💩", "👶", "👦", "👧", "👨", "👩", "👴", "👵", "💏", "💑", "👪", "👫", "👬", "👭", "👤", "👥", "👮", "👷", "💁", "💂", "👯", "👰", "👸", "🎅", "👼", "👱", "👲", "👳", "💃", "💆", "💇", "💅", "👻", "👹", "👺", "👽", "👾", "👿", "💀", "💪", "👀", "👂", "👃", "👣", "👄", "👅", "💋", "❤", "💙", "💚", "💛", "💜", "💓", "💔", "💕", "💖", "💗", "💘", "💝", "💞", "💟", "👍", "👎", "👌", "✊", "✌", "✋", "👊", "☝", "👆", "👇", "👈", "👉", "👋", "👏", "👐"}, new String[]{"🐕", "🐶", "🐩", "🐈", "🐱", "🐀", "🐁", "🐭", "🐹", "🐢", "🐇", "🐰", "🐓", "🐔", "🐣", "🐤", "🐥", "🐦", "🐏", "🐑", "🐐", "🐺", "🐃", "🐂", "🐄", "🐮", "🐴", "🐗", "🐖", "🐷", "🐽", "🐸", "🐍", "🐼", "🐧", "🐘", "🐨", "🐒", "🐵", "🐆", "🐯", "🐻", "🐫", "🐪", "🐊", "🐳", "🐋", "🐟", "🐠", "🐡", "🐙", "🐚", "🐬", "🐌", "🐛", "🐜", "🐝", "🐞", "🐲", "🐉", "🐾", "🍸", "🍺", "🍻", "🍷", "🍹", "🍶", "☕", "🍵", "🍼", "🍴", "🍨", "🍧", "🍦", "🍩", "🍰", "🍪", "🍫", "🍬", "🍭", "🍮", "🍯", "🍳", "🍔", "🍟", "🍝", "🍕", "🍖", "🍗", "🍤", "🍣", "🍱", "🍞", "🍜", "🍙", "🍚", "🍛", "🍲", "🍥", "🍢", "🍡", "🍘", "🍠", "🍌", "🍎", "🍏", "🍊", "🍋", "🍄", "🍅", "🍆", "🍇", "🍈", "🍉", "🍐", "🍑", "🍒", "🍓", "🍍", "🌰", "🌱", "🌲", "🌳", "🌴", "🌵", "🌷", "🌸", "🌹", "🍀", "🍁", "🍂", "🍃", "🌺", "🌻", "🌼", "🌽", "🌾", "🌿", "☀", "🌈", "⛅", "☁", "🌁", "🌂", "☔", "💧", "⚡", "🌀", "❄", "⛄", "🌙", "🌞", "🌝", "🌚", "🌛", "🌜", "🌑", "🌒", "🌓", "🌔", "🌕", "🌖", "🌗", "🌘", "🎑", "🌄", "🌅", "🌇", "🌆", "🌃", "🌌", "🌉", "🌊", "🌋", "🌎", "🌏", "🌍", "🌐"}, new String[]{"🏠", "🏡", "🏢", "🏣", "🏤", "🏥", "🏦", "🏧", "🏨", "🏩", "🏪", "🏫", "⛪", "⛲", "🏬", "🏯", "🏰", "🏭", "🗻", "🗼", "🗽", "🗾", "🗿", "⚓", "🏮", "💈", "🔧", "🔨", "🔩", "🚿", "🛁", "🛀", "🚽", "🚾", "🎽", "🎣", "🎱", "🎳", "⚾", "⛳", "🎾", "⚽", "🎿", "🏀", "🏁", "🏂", "🏃", "🏄", "🏆", "🏇", "🐎", "🏈", "🏉", "🏊", "🚂", "🚃", "🚄", "🚅", "🚆", "🚇", "Ⓜ", "🚈", "🚊", "🚋", "🚌", "🚍", "🚎", "🚏", "🚐", "🚑", "🚒", "🚓", "🚔", "🚕", "🚖", "🚗", "🚘", "🚙", "🚚", "🚛", "🚜", "🚝", "🚞", "🚟", "🚠", "🚡", "🚢", "🚣", "🚁", "✈", "🛂", "🛃", "🛄", "🛅", "⛵", "🚲", "🚳", "🚴", "🚵", "🚷", "🚸", "🚉", "🚀", "🚤", "🚶", "⛽", "🅿", "🚥", "🚦", "🚧", "🚨", "♨", "💌", "💍", "💎", "💐", "💒", "\ufe4e5", "\ufe4e6", "\ufe4e7", "\ufe4e8", "\ufe4e9", "\ufe4ea", "\ufe4eb", "\ufe4ec", "\ufe4ed", "\ufe4ee"}, new String[]{"🔰", "💄", "👞", "👟", "👑", "👒", "🎩", "🎓", "👓", "⌚", "👔", "👕", "👖", "👗", "👘", "👙", "👠", "👡", "👢", "👚", "👜", "💼", "🎒", "👝", "👛", "💰", "💳", "💲", "💵", "💴", "💶", "💷", "💸", "💱", "💹", "🔫", "🔪", "💣", "💉", "💊", "🚬", "🔔", "🔕", "🚪", "🔬", "🔭", "🔮", "🔦", "🔋", "🔌", "📜", "📗", "📘", "📙", "📚", "📔", "📒", "📑", "📓", "📕", "📖", "📰", "📛", "🎃", "🎄", "🎀", "🎁", "🎂", "🎈", "🎆", "🎇", "🎉", "🎊", "🎍", "🎏", "🎌", "🎐", "🎋", "🎎", "📱", "📲", "📟", "☎", "📞", "📠", "📦", "✉", "📨", "📩", "📪", "📫", "📭", "📬", "📮", "📤", "📥", "📯", "📢", "📣", "📡", "💬", "💭", "✒", "✏", "📝", "📏", "📐", "📍", "📌", "📎", "✂", "💺", "💻", "💽", "💾", "💿", "📆", "📅", "📇", "📋", "📁", "📂", "📃", "📄", "📊", "📈", "📉", "⛺", "🎡", "🎢", "🎠", "🎪", "🎨", "🎬", "🎥", "📷", "📹", "🎦", "🎭", "🎫", "🎮", "🎲", "🎰", "🃏", "🎴", "🀄", "🎯", "📺", "📻", "📀", "📼", "🎧", "🎤", "🎵", "🎶", "🎼", "🎻", "🎹", "🎷", "🎺", "🎸", "〽"}, new String[]{"\ufe82e", "\ufe82f", "\ufe830", "\ufe831", "\ufe832", "\ufe833", "\ufe834", "\ufe835", "\ufe836", "\ufe837", "🔟", "\ufe82c", "🔝", "🔙", "🔛", "🔜", "🔚", "⏳", "⌛", "⏰", "♈", "♉", "♊", "♋", "♌", "♍", "♎", "♏", "♐", "♑", "♒", "♓", "⛎", "🔱", "🔯", "🚻", "🚮", "🚯", "🚰", "🚱", "🅰", "🅱", "🆎", "🅾", "💮", "💯", "🔠", "🔡", "🔢", "🔣", "🔤", "➿", "📶", "📳", "📴", "📵", "🚹", "🚺", "🚼", "♿", "♻", "🚭", "🚩", "⚠", "🈁", "🔞", "⛔", "🆒", "🆗", "🆕", "🆘", "🆙", "🆓", "🆖", "🆚", "🈲", "🈳", "🈴", "🈵", "🈶", "🈷", "🈸", "🈹", "🈂", "🈺", "🉐", "🉑", "㊙", "®", "©", "™", "🈚", "🈯", "㊗", "⭕", "❌", "❎", "ℹ", "🚫", "✅", "✔", "🔗", "✴", "✳", "➕", "➖", "✖", "➗", "💠", "💡", "💤", "💢", "🔥", "💥", "💨", "💦", "💫", "🕛", "🕧", "🕐", "🕜", "🕑", "🕝", "🕒", "🕞", "🕓", "🕟", "🕔", "🕠", "🕕", "🕡", "🕖", "🕢", "🕗", "🕣", "🕘", "🕤", "🕙", "🕥", "🕚", "🕦", "↕", "⬆", "↗", "➡", "↘", "⬇", "↙", "⬅", "↖", "↔", "⤴", "⤵", "⏪", "⏫", "⏬", "⏩", "◀", "▶", "🔽", "🔼", "❇", "✨", "🔴", "🔵", "⚪", "⚫", "🔳", "🔲", "⭐", "🌟", "🌠", "▫", "▪", "◽", "◾", "◻", "◼", "⬜", "⬛", "🔸", "🔹", "🔶", "🔷", "🔺", "🔻", "❔", "❓", "❕", "❗", "‼", "⁉", "〰", "➰", "♠", "♥", "♣", "♦", "🆔", "🔑", "↩", "🆑", "🔍", "🔒", "🔓", "↪", "🔐", "☑", "🔘", "🔎", "🔖", "🔏", "🔃", "🔀", "🔁", "🔂", "🔄", "📧", "🔅", "🔆", "🔇", "🔈", "🔉", "🔊"}, new String[]{"🍇", "🍈", "🍉", "🍊", "🍋", "🍌", "🍍", "🍎", "🍏", "🍐", "🍑", "🍒", "🍓", "🍅", "🍆", "🌽", "🌶", "🍄", "🌰", "🍞", "🧀", "🍖", "🍗", "🍔", "🍟", "🍕", "🌭", "🌮", "🌯", "🍿", "🍲", "🍱", "🍘", "🍙", "🍚", "🍛", "🍜", "🍝", "🍠", "🍢", "🍣", "🍤", "🍥", "🍡", "🍦", "🍧", "🍨", "🍩", "🍪", "🎂", "🍰", "🍫", "🍬", "🍭", "🍮", "🍯", "🍼", "☕", "🍵", "🍶", "🍾", "🍷", "🍸", "🍹", "🍺", "🍻", "🍽", "🍴", "🍳", "🏺"}, new String[]{"🎃", "🎄", "🎆", "🎇", "✨", "🎈", "🎉", "🎊", "🎋", "🎌", "🎍", "🎎", "🎏", "🎐", "🎑", "🎀", "🎁", "🎖", "🎗", "🎞", "🎟", "🎫", "🏷", "⚽", "⚾", "🏀", "🏈", "🏉", "🎾", "🎱", "🎳", "⛳", "🏌", "🎣", "🎽", "🎿", "🏂", "🏄", "🏇", "🏊", "🏋", "🚴", "🚵", "🏎", "🏍", "🏅", "🏆", "🏏", "🏐", "🏑", "🏒", "🏓", "🏸", "🎯", "🎮", "🕹", "🎲", "♠", "♥", "♦", "♣", "🃏", "🀄", "🎴"}, new String[]{"🇦🇩", "🇦🇪", "🇦🇫", "🇦🇬", "🇦🇮", "🇦🇱", "🇦🇲", "🇦🇴", "🇦🇷", "🇦🇸", "🇦🇹", "🇦🇺", "🇦🇼", "🇦🇽", "🇦🇿", "🇧🇦", "🇧🇧", "🇧🇩", "🇧🇪", "🇧🇫", "🇧🇬", "🇧🇭", "🇧🇮", "🇧🇯", "🇧🇲", "🇧🇳", "🇧🇴", "🇧🇷", "🇧🇸", "🇧🇹", "🇧🇼", "🇧🇾", "🇧🇿", "🇨🇦", "🇨🇨", "🇨🇩", "🇨🇫", "🇨🇬", "🇨🇭", "🇨🇮", "🇨🇰", "🇨🇱", "🇨🇲", "🇨🇳", "🇨🇴", "🇨🇷", "🇨🇺", "🇨🇻", "🇨🇼", "🇨🇽", "🇨🇾", "🇨🇿", "🇩🇪", "🇩🇯", "🇩🇰", "🇩🇲", "🇩🇴", "🇩🇿", "🇪🇨", "🇪🇪", "🇪🇬", "🇪🇷", "🇪🇸", "🇪🇹", "🇪🇺", "🇫🇮", "🇫🇯", "🇫🇲", "🇫🇴", "🇫🇷", "🇬🇦", "🇬🇧", "🇬🇩", "🇬🇪", "🇬🇬", "🇬🇭", "🇬🇮", "🇬🇱", "🇬🇲", "🇬🇳", "🇬🇶", "🇬🇷", "🇬🇹", "🇬🇺", "🇬🇼", "🇬🇾", "🇭🇰", "🇭🇳", "🇭🇷", "🇭🇹", "🇭🇺", "🇮🇩", "🇮🇪", "🇮🇱", "🇮🇲", "🇮🇳", "🇮🇴", "🇮🇶", "🇮🇷", "🇮🇸", "🇮🇹", "🇯🇪", "🇯🇲", "🇯🇴", "🇯🇵", "🇰🇪", "🇰🇬", "🇰🇭", "🇰🇮", "🇰🇲", "🇰🇳", "🇰🇵", "🇰🇷", "🇰🇼", "🇰🇾", "🇰🇿", "🇱🇦", "🇱🇧", "🇱🇨", "🇱🇮", "🇱🇰", "🇱🇷", "🇱🇸", "🇱🇹", "🇱🇺", "🇱🇻", "🇱🇾", "🇲🇦", "🇲🇨", "🇲🇩", "🇲🇪", "🇲🇬", "🇲🇭", "🇲🇰", "🇲🇱", "🇲🇲", "🇲🇳", "🇲🇴", "🇲🇵", "🇲🇷", "🇲🇸", "🇲🇹", "🇲🇺", "🇲🇻", "🇲🇼", "🇲🇽", "🇲🇾", "🇲🇿", "🇳🇦", "🇳🇪", "🇳🇫", "🇳🇬", "🇳🇮", "🇳🇱", "🇳🇴", "🇳🇵", "🇳🇷", "🇳🇺", "🇳🇿", "🇴🇲", "🇵🇦", "🇵🇪", "🇵🇫", "🇵🇬", "🇵🇭", "🇵🇰", "🇵🇱", "🇵🇳", "🇵🇷", "🇵🇸", "🇵🇹", "🇵🇼", "🇵🇾", "🇶🇦", "🇷🇴", "🇷🇸", "🇷🇺", "🇷🇼", "🇸🇦", "🇸🇧", "🇸🇨", "🇸🇩", "🇸🇪", "🇸🇬", "🇸🇮", "🇸🇰", "🇸🇱", "🇸🇲", "🇸🇳", "🇸🇴", "🇸🇷", "🇸🇸", "🇸🇹", "🇸🇻", "🇸🇽", "🇸🇾", "🇸🇿", "🇹🇨", "🇹🇩", "🇹🇬", "🇹🇭", "🇹🇯", "🇹🇰", "🇹🇱", "🇹🇲", "🇹🇳", "🇹🇴", "🇹🇷", "🇹🇹", "🇹🇻", "🇹🇼", "🇹🇿", "🇺🇦", "🇺🇬", "🇺🇸", "🇺🇾", "🇺🇿", "🇻🇦", "🇻🇨", "🇻🇪", "🇻🇬", "🇻🇮", "🇻🇳", "🇻🇺", "🇼🇸", "🇾🇪", "🇿🇦", "🇿🇲", "🇿🇼"}};
        f132834z = strArr;
        f132823A = strArr.length;
    }

    /* synthetic */ C28652r(AbstractC28654t abstractC28654t) {
        this();
    }

    /* renamed from: J */
    private Pattern m143330J() {
        String str;
        m143339T();
        if (AbstractC26683d.f126393l) {
            C28050e3.m141486l().m141500m();
        }
        this.f132847m = MainApplication.getAppContext().getResources().getDisplayMetrics().density;
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append('(');
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                int i13 = 0;
                do {
                    String[] strArr = f132829u;
                    if (i11 >= strArr.length) {
                        break loop0;
                    }
                    String lowerCase = strArr[i11].toLowerCase(Locale.US);
                    this.f132839e.add(lowerCase);
                    this.f132835a.put(lowerCase, new C31972j4(i12, i13));
                    String[] strArr2 = f132830v;
                    if (i11 < strArr2.length && (str = strArr2[i11]) != null && !TextUtils.isEmpty(str)) {
                        this.f132836b.put(lowerCase, strArr2[i11]);
                    }
                    if (!lowerCase.equals(":(") && !lowerCase.equals(":)") && !lowerCase.equals("8*")) {
                        sb2.append(Pattern.quote(lowerCase));
                        sb2.append('|');
                    }
                    i13++;
                    i11++;
                } while (i11 % 10 != 0);
                i12++;
            }
            sb2.append(Pattern.quote(":("));
            sb2.append('|');
            sb2.append(Pattern.quote(":)"));
            sb2.append('|');
            sb2.append(Pattern.quote("8*"));
            sb2.append('|');
            StringBuilder sb3 = new StringBuilder(sb2);
            HashMap hashMap = new HashMap();
            int i14 = 0;
            while (true) {
                String[] strArr3 = f132831w;
                if (i14 >= strArr3.length) {
                    break;
                }
                String str2 = strArr3[i14];
                hashMap.put(str2, str2);
                sb3.append(Pattern.quote(strArr3[i14]));
                sb3.append('|');
                i14++;
            }
            for (int i15 = 0; i15 < this.f132845k.size(); i15++) {
                for (int i16 = 0; i16 < ((C31949hb) this.f132845k.get(i15)).m153605c().size(); i16++) {
                    if (!hashMap.containsKey(((C31949hb) this.f132845k.get(i15)).m153605c().get(i16))) {
                        sb3.append(Pattern.quote((String) ((C31949hb) this.f132845k.get(i15)).m153605c().get(i16)));
                        sb3.append('|');
                    }
                }
            }
            sb2.replace(sb2.length() - 1, sb2.length(), ")");
            sb3.replace(sb3.length() - 1, sb3.length(), ")");
            this.f132843i = Pattern.compile(sb3.toString());
            f132828t = AbstractC28236y3.m142194e("emoticon.png");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return Pattern.compile(sb2.toString());
    }

    /* renamed from: K */
    public static boolean m143331K(char c11) {
        int type = Character.getType(c11);
        if (type != 19 && type != 28) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public static boolean m143332M(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.trim().toLowerCase(Locale.US);
        if (lowerCase.contains(" ")) {
            return false;
        }
        int i11 = 0;
        while (true) {
            String[] strArr = f132829u;
            if (i11 >= strArr.length) {
                return false;
            }
            if (lowerCase.equals(strArr[i11].toLowerCase(Locale.US))) {
                return true;
            }
            i11++;
        }
    }

    /* renamed from: N */
    private boolean m143333N(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i11 = 0;
        while (true) {
            String[] strArr = f132829u;
            if (i11 >= strArr.length) {
                return false;
            }
            if (str.equals(strArr[i11].toLowerCase(Locale.US))) {
                return true;
            }
            i11++;
        }
    }

    /* renamed from: O */
    public /* synthetic */ void m143334O() {
        int i11;
        try {
            if (Build.VERSION.SDK_INT < 23) {
                i11 = 5;
            } else {
                i11 = f132823A;
            }
            if (C24265l.m126676s().m126699o().m128546d()) {
                this.f132846l.clear();
                InputStream open = MainApplication.getAppContext().getAssets().open("emoji_by_cate.json");
                byte[] bArr = new byte[open.available()];
                if (open.read(bArr) > 0) {
                    JSONArray jSONArray = new JSONArray(new String(bArr, StandardCharsets.UTF_8));
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        C31949hb m153604b = C31949hb.m153604b(jSONArray.getJSONObject(i12));
                        if (m153604b != null) {
                            this.f132846l.add(m153604b);
                        }
                    }
                }
                open.close();
            }
            this.f132845k.clear();
            for (int i13 = 0; i13 < i11; i13++) {
                String[][] strArr = f132834z;
                if (i13 < strArr.length) {
                    this.f132845k.add(C31949hb.m153603a(new C28211v5(null), strArr[i13]));
                }
            }
            AbstractC20110a.m104535d("Reaction loadSystemEmojiData->done", new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: P */
    public /* synthetic */ void m143335P(String str, Editable editable, int i11, int i12, int i13, String str2, Drawable drawable, C28050e3.c cVar) {
        if (str.toLowerCase(Locale.US).equals(str2) && drawable != null) {
            synchronized (editable) {
                m143366b0(i11, i12, i13, cVar, drawable, editable);
            }
        }
    }

    /* renamed from: Q */
    public /* synthetic */ void m143336Q(String str, Editable editable, int i11, int i12, int i13, String str2, Drawable drawable, C28050e3.c cVar) {
        if (str.toLowerCase(Locale.US).equals(str2) && drawable != null) {
            synchronized (editable) {
                m143366b0(i11, i12, i13, cVar, drawable, editable);
            }
        }
    }

    /* renamed from: R */
    private void m143337R() {
        String m4157r1 = AbstractC0924m0.m4157r1();
        if (!TextUtils.isEmpty(m4157r1)) {
            try {
                JSONArray jSONArray = new JSONArray(m4157r1);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    this.f132841g.add(jSONArray.optString(i11));
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: S */
    private void m143338S() {
        String m121595X7 = AbstractC23309i.m121595X7();
        if (!TextUtils.isEmpty(m121595X7)) {
            try {
                JSONArray jSONArray = new JSONArray(m121595X7);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    this.f132840f.add(jSONArray.optString(i11));
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: T */
    private void m143339T() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vw.n
            public /* synthetic */ RunnableC28648n() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28652r.this.m143334O();
            }
        });
    }

    /* renamed from: V */
    private CharSequence m143340V(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT <= this.f132849o && this.f132848n) {
            return C1698f.m8679c().m8690n(charSequence);
        }
        return charSequence;
    }

    /* renamed from: i */
    public static boolean m143346i(String str) {
        return f132824B.mo8676a(str, 0, str.length(), Build.VERSION.SDK_INT);
    }

    /* renamed from: m */
    public static boolean m143347m() {
        if (AbstractC23309i.m121453Td() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static Bitmap m143348p() {
        return f132828t;
    }

    /* renamed from: v */
    public static C28652r m143349v() {
        if (d.f132862a.f132844j && AbstractC23138m0.m118770b()) {
            d.f132862a.m143339T();
            d.f132862a.f132844j = false;
        }
        return d.f132862a;
    }

    /* renamed from: A */
    public CharSequence m143350A(SpannableString spannableString) {
        f132827s = true;
        CharSequence m143354E = m143354E(spannableString);
        f132827s = false;
        return m143354E;
    }

    /* renamed from: B */
    public CharSequence m143351B(SpannableString spannableString, float f11) {
        f132827s = true;
        CharSequence m143355F = m143355F(spannableString, f11);
        f132827s = false;
        return m143355F;
    }

    /* renamed from: C */
    public CharSequence m143352C(SpannableStringBuilder spannableStringBuilder, float f11) {
        f132827s = true;
        CharSequence m143356G = m143356G(spannableStringBuilder, f11);
        f132827s = false;
        return m143356G;
    }

    /* renamed from: D */
    public CharSequence m143353D(String str) {
        f132827s = true;
        CharSequence m143357H = m143357H(str);
        f132827s = false;
        return m143357H;
    }

    /* renamed from: E */
    public CharSequence m143354E(SpannableString spannableString) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        if (m143362X(spannableStringBuilder, 0.0f)) {
            return spannableStringBuilder;
        }
        return m143340V(spannableString);
    }

    /* renamed from: F */
    public CharSequence m143355F(SpannableString spannableString, float f11) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        if (m143362X(spannableStringBuilder, f11)) {
            return spannableStringBuilder;
        }
        return m143340V(spannableString);
    }

    /* renamed from: G */
    public CharSequence m143356G(SpannableStringBuilder spannableStringBuilder, float f11) {
        if (m143362X(spannableStringBuilder, f11)) {
            return spannableStringBuilder;
        }
        return m143340V(spannableStringBuilder);
    }

    /* renamed from: H */
    public CharSequence m143357H(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (m143362X(spannableStringBuilder, 0.0f)) {
            return spannableStringBuilder;
        }
        return m143340V(str);
    }

    /* renamed from: I */
    public CharSequence m143358I(String str, float f11) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (m143362X(spannableStringBuilder, f11)) {
            return spannableStringBuilder;
        }
        return m143340V(str);
    }

    /* renamed from: L */
    public boolean m143359L() {
        return Build.VERSION.SDK_INT > this.f132849o || this.f132848n;
    }

    /* renamed from: U */
    public C31957i4 m143360U(String str) {
        Matcher matcher;
        int i11;
        C31957i4 c31957i4 = new C31957i4();
        if (TextUtils.isEmpty(str)) {
            return c31957i4;
        }
        HashMap hashMap = new HashMap();
        String lowerCase = str.trim().toLowerCase(Locale.US);
        Matcher matcher2 = this.f132843i.matcher(lowerCase);
        int i12 = 0;
        String str2 = "";
        int i13 = 0;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = true;
        int i14 = 0;
        int i15 = 0;
        while (matcher2.find()) {
            int start = matcher2.start();
            int end = matcher2.end();
            String group = matcher2.group(i12);
            if (z11) {
                c31957i4.f146866d = group;
                z11 = false;
            }
            c31957i4.f146869g = group;
            c31957i4.f146864b++;
            if (hashMap.containsKey(group)) {
                i11 = ((Integer) hashMap.get(group)).intValue() + 1;
                matcher = matcher2;
                hashMap.put(group, Integer.valueOf(i11));
            } else {
                matcher = matcher2;
                hashMap.put(group, 1);
                c31957i4.f146865c++;
                if (!z12 && m143333N(group)) {
                    z12 = true;
                }
                if (!z13 && !m143333N(group)) {
                    i11 = 1;
                    z13 = true;
                } else {
                    i11 = 1;
                }
            }
            if (i11 > i14) {
                str2 = group;
                i14 = i11;
            }
            if (i15 == start || TextUtils.isEmpty(lowerCase.substring(i15, start).trim())) {
                i15 = end;
            } else {
                z14 = false;
            }
            i13 = end;
            matcher2 = matcher;
            i12 = 0;
        }
        if (i13 != lowerCase.length()) {
            z14 = false;
        }
        if (!z12 && !z13) {
            c31957i4.f146863a = 0;
        } else if (z12 && !z13) {
            c31957i4.f146863a = 1;
        } else if (!z12 && z13) {
            c31957i4.f146863a = 2;
        } else {
            c31957i4.f146863a = 3;
        }
        c31957i4.f146868f = z14;
        c31957i4.f146867e = str2;
        return c31957i4;
    }

    /* renamed from: W */
    public boolean m143361W(Editable editable) {
        return m143362X(editable, 0.0f);
    }

    /* renamed from: X */
    public boolean m143362X(Editable editable, float f11) {
        int i11;
        if (editable != null) {
            i11 = editable.length() - 1;
        } else {
            i11 = 0;
        }
        return m143363Y(editable, 0, i11, f11);
    }

    /* renamed from: Y */
    public boolean m143363Y(Editable editable, int i11, int i12, float f11) {
        boolean z11 = false;
        if (i11 >= i12 || editable == null) {
            return false;
        }
        try {
            m143340V(editable);
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(i11, i12, ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            z11 = m143364Z(editable, i11, i12, f11);
            return z11;
        } catch (Exception e11) {
            e11.printStackTrace();
            return z11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0134, code lost:            if (r15.start() == r12) goto L287;     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161 A[Catch: Exception -> 0x0098, TRY_LEAVE, TryCatch #4 {Exception -> 0x0098, blocks: (B:35:0x0074, B:39:0x007e, B:41:0x0091, B:57:0x0152, B:59:0x0161, B:127:0x014b), top: B:34:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017c  */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m143364Z(Editable editable, int i11, int i12, float f11) {
        boolean z11;
        float f12;
        boolean z12;
        int i13;
        int i14;
        float f13;
        float f14;
        boolean z13;
        int i15;
        float f15;
        int i16;
        boolean z14;
        char charAt;
        boolean z15;
        boolean z16;
        boolean z17;
        C28652r c28652r = this;
        Editable editable2 = editable;
        boolean z18 = false;
        try {
            int m118712h = AbstractC23136l9.m118712h(MainApplication.getAppContext(), 16.0f);
            int i17 = 1;
            if (AbstractC23309i.m121379Rd() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            String lowerCase = editable.toString().toLowerCase(Locale.US);
            if (TextUtils.isEmpty(editable) || editable.length() != lowerCase.length()) {
                return false;
            }
            Matcher matcher = c28652r.f132842h.matcher(lowerCase);
            if (f11 > 0.0f) {
                try {
                    f12 = f11 + AbstractC23136l9.m118742r(2.0f);
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    return z18;
                }
            } else {
                f12 = f11;
            }
            int i18 = 0;
            while (matcher.find()) {
                i18++;
            }
            if (AbstractC26683d.f126393l) {
                if (f132827s) {
                    if (i18 <= AbstractC28245z3.f131681a) {
                        z17 = true;
                        z12 = z17;
                    }
                }
                z17 = false;
                z12 = z17;
            } else {
                z12 = false;
            }
            int i19 = i11;
            int i21 = i19;
            boolean z19 = false;
            boolean z21 = true;
            while (matcher.find(i19) && i19 < i12) {
                try {
                    int start = matcher.start();
                    int end = matcher.end();
                    String group = matcher.group();
                    if (end >= editable.length() - i17) {
                        i13 = editable.length() - i17;
                    } else {
                        i13 = end;
                    }
                    if (z11) {
                        if (start == 0) {
                            try {
                                if (end == lowerCase.length()) {
                                    i14 = i21;
                                    z21 = true;
                                } else if (end < lowerCase.length()) {
                                    char charAt2 = lowerCase.charAt(end);
                                    if (charAt2 != '\t' && charAt2 != '\n' && charAt2 != ' ') {
                                        z21 = false;
                                    } else {
                                        z21 = true;
                                    }
                                    if (!z21) {
                                        try {
                                            if (matcher.find(i13) && matcher.start() == i13) {
                                                z21 = true;
                                            }
                                        } catch (Exception e12) {
                                            try {
                                                e12.printStackTrace();
                                            } catch (Exception e13) {
                                                e = e13;
                                                i14 = i21;
                                                e.printStackTrace();
                                                boolean z22 = z21;
                                                long nanoTime = System.nanoTime();
                                                if (((URLSpan[]) editable2.getSpans(start, end, URLSpan.class)).length != 0) {
                                                }
                                                i17 = 1;
                                            }
                                        }
                                    }
                                } else {
                                    i14 = i21;
                                    z21 = false;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                i14 = i21;
                                z21 = false;
                                e.printStackTrace();
                                boolean z222 = z21;
                                long nanoTime2 = System.nanoTime();
                                if (((URLSpan[]) editable2.getSpans(start, end, URLSpan.class)).length != 0) {
                                }
                                i17 = 1;
                            }
                        } else {
                            if (start == i21 || (start - 1 >= 0 && ((charAt = lowerCase.charAt(i16)) == '\t' || charAt == '\n' || charAt == ' '))) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (end == lowerCase.length()) {
                                i14 = i21;
                            } else {
                                if (end < lowerCase.length()) {
                                    char charAt3 = lowerCase.charAt(end);
                                    i14 = i21;
                                    if (charAt3 != '\t' && charAt3 != '\n' && charAt3 != ' ') {
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    if (!z15) {
                                        try {
                                            if (matcher.find(i13)) {
                                            }
                                        } catch (Exception e15) {
                                            try {
                                                e15.printStackTrace();
                                            } catch (Exception e16) {
                                                e = e16;
                                                z21 = false;
                                                e.printStackTrace();
                                                boolean z2222 = z21;
                                                long nanoTime22 = System.nanoTime();
                                                if (((URLSpan[]) editable2.getSpans(start, end, URLSpan.class)).length != 0) {
                                                }
                                                i17 = 1;
                                            }
                                        }
                                    }
                                } else {
                                    i14 = i21;
                                    z15 = false;
                                }
                                if (!z14 && z15) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                z21 = z16;
                            }
                            z15 = true;
                            if (!z14) {
                            }
                            z16 = false;
                            z21 = z16;
                        }
                        boolean z22222 = z21;
                        long nanoTime222 = System.nanoTime();
                        if (((URLSpan[]) editable2.getSpans(start, end, URLSpan.class)).length != 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Emotion wrapped in URL, ignored emoticon. Time consumed: ");
                            sb2.append(System.nanoTime() - nanoTime222);
                            z21 = z22222;
                            i19 = i13;
                            i21 = i14;
                        } else {
                            if (z22222) {
                                try {
                                    if (C13778s1.m76966g()) {
                                        f13 = C13778s1.m76962c();
                                    } else {
                                        f13 = 1.0f;
                                    }
                                    if (f12 > 0.0f) {
                                        f14 = (f12 / MainApplication.getAppContext().getResources().getDisplayMetrics().density) + 0.5f;
                                    } else {
                                        f14 = f13 * 18.0f;
                                    }
                                    int i22 = (int) f14;
                                    if (c28652r.m143374l(group) && f12 > (m118712h * 300) / 100) {
                                        C17890c c17890c = new C17890c((C16654c) c28652r.m143376o(group));
                                        c17890c.m94434a(f12);
                                        editable2.setSpan(new ImageSpan(c17890c), start, end, 33);
                                        if (AbstractC26683d.f126393l && z12) {
                                            if (C28050e3.m141486l().m141493e(group)) {
                                                i15 = end;
                                                m143367c0(group, i22, start, i15, editable);
                                                z13 = z22222;
                                            } else {
                                                i15 = end;
                                                z13 = z22222;
                                                f15 = f12;
                                                C28050e3.m141486l().m141498j(group, i22, new C28050e3.e() { // from class: vw.o

                                                    /* renamed from: b */
                                                    public final /* synthetic */ String f132812b;

                                                    /* renamed from: c */
                                                    public final /* synthetic */ Editable f132813c;

                                                    /* renamed from: d */
                                                    public final /* synthetic */ int f132814d;

                                                    /* renamed from: e */
                                                    public final /* synthetic */ int f132815e;

                                                    /* renamed from: f */
                                                    public final /* synthetic */ int f132816f;

                                                    public /* synthetic */ C28649o(String group2, Editable editable3, int i222, int start2, int i152) {
                                                        r2 = group2;
                                                        r3 = editable3;
                                                        r4 = i222;
                                                        r5 = start2;
                                                        r6 = i152;
                                                    }

                                                    @Override // vg.C28050e3.e
                                                    /* renamed from: a */
                                                    public final void mo76136a(String str, Drawable drawable, C28050e3.c cVar) {
                                                        C28652r.this.m143335P(r2, r3, r4, r5, r6, str, drawable, cVar);
                                                    }
                                                });
                                            }
                                        } else {
                                            z13 = z22222;
                                            i152 = end;
                                        }
                                        f15 = f12;
                                    } else {
                                        z13 = z22222;
                                        i152 = end;
                                        f15 = f12;
                                        m143368d0(i222, start2, i152, group2, editable3);
                                        if (AbstractC26683d.f126393l && z12) {
                                            if (C28050e3.m141486l().m141493e(group2)) {
                                                m143367c0(group2, i222, start2, i152, editable3);
                                            } else {
                                                C28050e3.m141486l().m141498j(group2, i222, new C28050e3.e() { // from class: vw.p

                                                    /* renamed from: b */
                                                    public final /* synthetic */ String f132818b;

                                                    /* renamed from: c */
                                                    public final /* synthetic */ Editable f132819c;

                                                    /* renamed from: d */
                                                    public final /* synthetic */ int f132820d;

                                                    /* renamed from: e */
                                                    public final /* synthetic */ int f132821e;

                                                    /* renamed from: f */
                                                    public final /* synthetic */ int f132822f;

                                                    public /* synthetic */ C28650p(String group2, Editable editable3, int i222, int start2, int i152) {
                                                        r2 = group2;
                                                        r3 = editable3;
                                                        r4 = i222;
                                                        r5 = start2;
                                                        r6 = i152;
                                                    }

                                                    @Override // vg.C28050e3.e
                                                    /* renamed from: a */
                                                    public final void mo76136a(String str, Drawable drawable, C28050e3.c cVar) {
                                                        C28652r.this.m143336Q(r2, r3, r4, r5, r6, str, drawable, cVar);
                                                    }
                                                });
                                            }
                                        }
                                    }
                                    z19 = true;
                                } catch (Exception e17) {
                                    e = e17;
                                    z18 = true;
                                    e.printStackTrace();
                                    return z18;
                                }
                            } else {
                                z13 = z22222;
                                i152 = end;
                                f15 = f12;
                            }
                            c28652r = this;
                            editable2 = editable3;
                            z21 = z13;
                            i19 = i13;
                            i21 = i152;
                            f12 = f15;
                        }
                        i17 = 1;
                    }
                    i14 = i21;
                    boolean z222222 = z21;
                    long nanoTime2222 = System.nanoTime();
                    if (((URLSpan[]) editable2.getSpans(start2, end, URLSpan.class)).length != 0) {
                    }
                    i17 = 1;
                } catch (Exception e18) {
                    e = e18;
                    z18 = z19;
                }
            }
            return z19;
        } catch (Exception e19) {
            e = e19;
            z18 = false;
        }
    }

    /* renamed from: a0 */
    public void m143365a0() {
        this.f132844j = true;
    }

    /* renamed from: b0 */
    void m143366b0(int i11, int i12, int i13, C28050e3.c cVar, Drawable drawable, Editable editable) {
        AbstractC13560a m76015a = AbstractC13560a.Companion.m76015a(drawable, cVar, i11);
        if (m76015a != null) {
            editable.setSpan(m76015a, i12, i13, 33);
        }
    }

    /* renamed from: c0 */
    void m143367c0(String str, int i11, int i12, int i13, Editable editable) {
        synchronized (editable) {
            try {
                Drawable m141495g = C28050e3.m141486l().m141495g(str, i11);
                if (m141495g != null) {
                    String lowerCase = str.toLowerCase(Locale.US);
                    if (C28050e3.m141486l().m141492d(lowerCase)) {
                        m143366b0(i11, i12, i13, C28050e3.c.KEYFRAMES_EMOJI, m141495g, editable);
                    } else if (C28050e3.m141486l().m141494f(lowerCase)) {
                        m143366b0(i11, i12, i13, C28050e3.c.LOTTIE_EMOJI, m141495g, editable);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d0 */
    void m143368d0(int i11, int i12, int i13, String str, Editable editable) {
        editable.setSpan(new C13632f0(m143375n(str, i11), 1), i12, i13, 33);
    }

    /* renamed from: f */
    public void m143369f(String str) {
        C0824j.m2153b(new a(str));
    }

    /* renamed from: g */
    public void m143370g(String str) {
        C0824j.m2153b(new b(str));
    }

    /* renamed from: h */
    public List m143371h(int i11) {
        ArrayList arrayList = new ArrayList();
        String[] m143383x = m143383x();
        if (m143383x.length == 0) {
            m143337R();
            m143383x = m143383x();
        }
        for (int length = m143383x.length - 1; length >= 0; length--) {
            String str = m143383x[length];
            if (arrayList.size() < i11) {
                arrayList.add(str);
            }
        }
        if (m143383x.length < i11) {
            for (int i12 = 0; i12 < this.f132839e.size(); i12++) {
                String str2 = (String) this.f132839e.get(i12);
                if (!arrayList.contains(str2) && arrayList.size() < i11) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public void m143372j() {
        try {
            if (this.f132847m != MainApplication.getAppContext().getResources().getDisplayMetrics().density) {
                synchronized (this.f132838d) {
                    this.f132838d.clear();
                }
                this.f132847m = MainApplication.getAppContext().getResources().getDisplayMetrics().density;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: k */
    public boolean m143373k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.trim().toLowerCase(Locale.US);
        Matcher matcher = this.f132843i.matcher(lowerCase);
        int i11 = 0;
        int i12 = 0;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (i12 != start && !TextUtils.isEmpty(lowerCase.substring(i12, start).trim())) {
                return false;
            }
            i11 = end;
            i12 = i11;
        }
        if (i11 != lowerCase.length()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m143374l(String str) {
        return this.f132836b.containsKey(str);
    }

    /* renamed from: n */
    public C13637g0 m143375n(String str, int i11) {
        String lowerCase = (str + i11).toLowerCase();
        C13637g0 c13637g0 = null;
        try {
            if (this.f132838d.containsKey(lowerCase)) {
                c13637g0 = (C13637g0) this.f132838d.get(lowerCase);
            } else {
                C31972j4 c31972j4 = (C31972j4) this.f132835a.get(str.toLowerCase());
                if (c31972j4 != null) {
                    C13637g0 c13637g02 = new C13637g0(c31972j4, i11);
                    try {
                        this.f132838d.put(lowerCase, c13637g02);
                        c13637g0 = c13637g02;
                    } catch (Exception e11) {
                        e = e11;
                        c13637g0 = c13637g02;
                        e.printStackTrace();
                        return c13637g0;
                    } catch (OutOfMemoryError e12) {
                        e = e12;
                        c13637g0 = c13637g02;
                        e.printStackTrace();
                        return c13637g0;
                    }
                }
            }
        } catch (Exception e13) {
            e = e13;
        } catch (OutOfMemoryError e14) {
            e = e14;
        }
        return c13637g0;
    }

    /* renamed from: o */
    public Object m143376o(String str) {
        try {
            if (this.f132836b.containsKey(str)) {
                if (this.f132837c.containsKey(str)) {
                    return this.f132837c.get(str);
                }
                C16654c m88481f = C16654c.m88481f(MainApplication.getAppContext().getAssets(), "svg/" + ((String) this.f132836b.get(str)));
                this.f132837c.put(str, m88481f);
                return m88481f;
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: q */
    public C31972j4 m143377q(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            if (this.f132835a.containsKey(lowerCase)) {
                return (C31972j4) this.f132835a.get(lowerCase);
            }
            return null;
        }
        return null;
    }

    /* renamed from: r */
    public int m143378r(int i11, boolean z11) {
        if (z11 && m143359L()) {
            return f132833y[i11];
        }
        return f132832x[i11];
    }

    /* renamed from: s */
    public ArrayList m143379s() {
        return this.f132839e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* renamed from: t */
    public List m143380t(int i11, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        if (z11 != 0) {
            try {
                String[] m143382w = m143382w();
                if (m143382w.length == 0) {
                    m143338S();
                    m143382w = m143382w();
                }
                if (m143382w.length != 0) {
                    c cVar = new c(1);
                    cVar.f132858d = MainApplication.getAppContext().getString(AbstractC8020f0.str_title_emoji_recent);
                    arrayList.add(cVar);
                    int length = ((m143382w.length + i11) - 1) / i11;
                    int length2 = m143382w.length - 1;
                    for (int i12 = 0; i12 < length; i12++) {
                        c cVar2 = new c(0);
                        cVar2.f132861g = true;
                        int i13 = 0;
                        while (i13 < i11 && length2 >= 0) {
                            cVar2.f132857c.add(m143382w[length2]);
                            i13++;
                            length2--;
                        }
                        arrayList.add(cVar2);
                    }
                } else {
                    z11 = 0;
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        if (!this.f132839e.isEmpty()) {
            c cVar3 = new c(1);
            cVar3.f132856b = z11;
            cVar3.f132858d = MainApplication.getAppContext().getString(AbstractC8020f0.str_title_emoticon);
            arrayList.add(cVar3);
            int size = ((this.f132839e.size() + i11) - 1) / i11;
            for (int i14 = 0; i14 < size; i14++) {
                c cVar4 = new c(0);
                for (int i15 = 0; i15 < i11; i15++) {
                    int i16 = (i14 * i11) + i15;
                    if (i16 < this.f132839e.size()) {
                        String str = (String) this.f132839e.get(i16);
                        if (!TextUtils.isEmpty(str) && !str.equals(":-|") && !str.equals(":+") && !str.equals(";8") && !str.equals("/-jj")) {
                            cVar4.f132857c.add((String) this.f132839e.get(i16));
                        }
                    }
                }
                if (!cVar4.f132857c.isEmpty()) {
                    arrayList.add(cVar4);
                }
            }
        }
        c cVar5 = new c(1);
        cVar5.f132856b = 2;
        cVar5.f132858d = MainApplication.getAppContext().getString(AbstractC8020f0.str_title_emoji_system);
        arrayList.add(cVar5);
        int length3 = ((f132831w.length + i11) - 1) / i11;
        for (int i17 = 0; i17 < length3; i17++) {
            c cVar6 = new c(0);
            for (int i18 = 0; i18 < i11; i18++) {
                int i19 = (i17 * i11) + i18;
                String[] strArr = f132831w;
                if (i19 < strArr.length) {
                    cVar6.f132857c.add(strArr[i19]);
                }
            }
            arrayList.add(cVar6);
        }
        if (z12) {
            c cVar7 = new c(1);
            cVar7.f132856b = 4;
            arrayList.add(cVar7);
        }
        return arrayList;
    }

    /* renamed from: u */
    public List m143381u(int i11, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        if (z11) {
            String[] m143383x = m143383x();
            if (m143383x.length == 0) {
                m143337R();
                m143383x = m143383x();
            }
            if (m143383x.length != 0) {
                c cVar = new c(1);
                cVar.f132858d = MainApplication.getAppContext().getString(AbstractC8020f0.str_title_emoji_recent);
                arrayList.add(cVar);
                int length = ((m143383x.length + i11) - 1) / i11;
                int length2 = m143383x.length - 1;
                for (int i12 = 0; i12 < length; i12++) {
                    c cVar2 = new c(0);
                    cVar2.f132861g = true;
                    int i13 = 0;
                    while (i13 < i11 && length2 >= 0) {
                        cVar2.f132857c.add(m143383x[length2]);
                        i13++;
                        length2--;
                    }
                    arrayList.add(cVar2);
                }
            }
        }
        arrayList.addAll(m143380t(i11, false, false));
        return arrayList;
    }

    /* renamed from: w */
    public String[] m143382w() {
        String[] strArr;
        synchronized (this.f132840f) {
            strArr = (String[]) this.f132840f.toArray(new String[0]);
        }
        return strArr;
    }

    /* renamed from: x */
    public String[] m143383x() {
        String[] strArr;
        synchronized (this.f132841g) {
            strArr = (String[]) this.f132841g.toArray(new String[0]);
        }
        return strArr;
    }

    /* renamed from: y */
    public List m143384y(boolean z11) {
        if (z11) {
            if (m143359L()) {
                return this.f132846l;
            }
            return new ArrayList();
        }
        return this.f132845k;
    }

    /* renamed from: z */
    public int m143385z(boolean z11) {
        return m143384y(z11).size();
    }

    private C28652r() {
        this.f132835a = Collections.synchronizedMap(new HashMap());
        this.f132836b = Collections.synchronizedMap(new HashMap());
        this.f132837c = Collections.synchronizedMap(new HashMap());
        this.f132838d = Collections.synchronizedMap(new HashMap());
        this.f132839e = new ArrayList();
        this.f132840f = Collections.synchronizedSet(new LinkedHashSet());
        this.f132841g = Collections.synchronizedSet(new LinkedHashSet());
        this.f132844j = false;
        this.f132845k = new ArrayList();
        this.f132846l = new ArrayList();
        this.f132848n = false;
        this.f132849o = C19172a.m100600k("android_emoji_compat@version", 0);
        this.f132850p = C19172a.m100600k("android_emoji_compat@replace_all", 0) > 0;
        this.f132842h = m143330J();
    }
}
