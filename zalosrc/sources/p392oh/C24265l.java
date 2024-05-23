package p392oh;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.text.TextUtils;
import bn0.AbstractC2933b;
import bn0.AbstractC2943l;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12955e;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ln0.AbstractC22543l;
import me0.AbstractC23138m0;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import on0.AbstractC24344y;
import on0.C24321d;
import on0.C24329j;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p588vw.C28652r;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p716zh.C31949hb;
import ph.C24748a;
import ph.C24753f;
import ph.C24754g;
import ph.C24755h;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import qm0.AbstractC25378x;
import sm0.AbstractC26327c;

/* renamed from: oh.l */
/* loaded from: classes.dex */
public final class C24265l {
    public static final b Companion = new b(null);

    /* renamed from: u */
    private static final InterfaceC29232g f117196u = AbstractC29233h.m145990a(a.f117217q);

    /* renamed from: a */
    private final ArrayList f117197a;

    /* renamed from: b */
    private boolean f117198b;

    /* renamed from: c */
    private final ArrayList f117199c;

    /* renamed from: d */
    private boolean f117200d;

    /* renamed from: e */
    private String f117201e;

    /* renamed from: f */
    private boolean f117202f;

    /* renamed from: g */
    private final ArrayList f117203g;

    /* renamed from: h */
    private final HashMap f117204h;

    /* renamed from: i */
    private HashMap f117205i;

    /* renamed from: j */
    private int f117206j;

    /* renamed from: k */
    private int f117207k;

    /* renamed from: l */
    private final Map f117208l;

    /* renamed from: m */
    private final Map f117209m;

    /* renamed from: n */
    private final ArrayList f117210n;

    /* renamed from: o */
    private boolean f117211o;

    /* renamed from: p */
    private C24753f f117212p;

    /* renamed from: q */
    private String f117213q;

    /* renamed from: r */
    private boolean f117214r;

    /* renamed from: s */
    private final C24748a f117215s;

    /* renamed from: t */
    private boolean f117216t;

    /* renamed from: oh.l$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f117217q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24265l mo12V4() {
            return new C24265l(null);
        }
    }

    /* renamed from: oh.l$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m126708a(String str) {
            String str2;
            AbstractC19074t.m100208f(str, "inputWord");
            String m120002o = AbstractC23262x6.m120002o(str);
            AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
            List m127021i = new C24329j("(\\s)+").m127021i(m120002o, 0);
            ArrayList arrayList = new ArrayList();
            for (Object obj : m127021i) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                str2 = "(^" + arrayList.get(0) + "|\\s" + arrayList.get(0) + ")";
            } else {
                str2 = "";
            }
            if (arrayList.size() > 1) {
                int size = arrayList.size();
                for (int i11 = 1; i11 < size; i11++) {
                    str2 = ((Object) str2) + "(\\s)+(" + arrayList.get(i11) + ")";
                }
            }
            return str2;
        }

        /* renamed from: b */
        public final C24265l m126709b() {
            return (C24265l) C24265l.f117196u.getValue();
        }
    }

    /* renamed from: oh.l$c */
    /* loaded from: classes3.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Integer.valueOf(((String) obj).length()), Integer.valueOf(((String) obj2).length()));
            return m135478b;
        }
    }

    public /* synthetic */ C24265l(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: F */
    private final void m126661F() {
        synchronized (this) {
            try {
                if (!this.f117216t && AbstractC23138m0.Companion.m118777d()) {
                    this.f117215s.m128543a(C24748a.Companion.m128552a());
                    this.f117216t = true;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: H */
    public static final void m126662H(C24265l c24265l) {
        BufferedReader bufferedReader;
        AbstractC19074t.m100208f(c24265l, "this$0");
        try {
            ArrayList arrayList = new ArrayList();
            String[] strArr = C28652r.f132829u;
            AbstractC19074t.m100207e(strArr, "EMOTICONS_CHARACTERS");
            ArrayList arrayList2 = new ArrayList(strArr.length);
            for (String str : strArr) {
                AbstractC19074t.m100205c(str);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                arrayList2.add(lowerCase);
            }
            arrayList.addAll(arrayList2);
            if (c24265l.m126699o().m128546d()) {
                if (C28652r.m143349v().m143359L()) {
                    List m143384y = C28652r.m143349v().m143384y(true);
                    AbstractC19074t.m100207e(m143384y, "getListSystemEmojiCategoryInfo(...)");
                    Iterator it = m143384y.iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(((C31949hb) it.next()).m153605c());
                    }
                } else {
                    String[] strArr2 = C28652r.f132831w;
                    AbstractC19074t.m100207e(strArr2, "EMOJI_SYSTEM_CUSTOM");
                    AbstractC25378x.m131549y(arrayList, strArr2);
                }
            }
            c24265l.f117208l.clear();
            InputStream open = MainApplication.Companion.m35500c().getApplicationContext().getAssets().open("emoji_searchmap.json");
            AbstractC19074t.m100207e(open, "open(...)");
            Reader inputStreamReader = new InputStreamReader(open, C24321d.f117408b);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            try {
                JSONObject jSONObject = new JSONObject(AbstractC2943l.m13931c(bufferedReader));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    ArrayList arrayList3 = new ArrayList();
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        String string = jSONArray.getString(i11);
                        if (string != null) {
                            AbstractC19074t.m100205c(string);
                            if (arrayList.contains(string)) {
                                arrayList3.add(string);
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        Map map = c24265l.f117208l;
                        AbstractC19074t.m100207e(map, "mapDataSearch");
                        map.put(next, arrayList3);
                    }
                }
                bufferedReader.close();
                AbstractC19074t.m100207e(c24265l.f117209m, "mapTreeSearch");
                if (!r0.isEmpty()) {
                    c24265l.f117209m.clear();
                }
                c24265l.f117211o = true;
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(bufferedReader, null);
            } finally {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: I */
    private final void m126663I() {
        JSONObject jSONObject;
        synchronized (this) {
            try {
                if (this.f117202f) {
                    return;
                }
                this.f117203g.clear();
                String m4187s1 = AbstractC0924m0.m4187s1();
                try {
                    AbstractC19074t.m100205c(m4187s1);
                    if (m4187s1.length() > 0) {
                        JSONArray jSONArray = new JSONArray(m4187s1);
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            Object obj = jSONArray.get(i11);
                            if (obj instanceof JSONObject) {
                                jSONObject = (JSONObject) obj;
                            } else {
                                jSONObject = null;
                            }
                            if (jSONObject != null) {
                                this.f117203g.add(C24753f.Companion.m128618e(jSONObject));
                            }
                        }
                    }
                    this.f117202f = true;
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104551d("CustomReactionTypeManager", e11);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: L */
    private final void m126664L(String str) {
        try {
            try {
                if (!this.f117198b) {
                    this.f117197a.clear();
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        ArrayList arrayList = this.f117197a;
                        C24753f.b bVar = C24753f.Companion;
                        JSONObject jSONObject = jSONArray.getJSONObject(i11);
                        AbstractC19074t.m100207e(jSONObject, "getJSONObject(...)");
                        arrayList.add(bVar.m128618e(jSONObject));
                    }
                    this.f117198b = true;
                }
                C23744a.Companion.m124119a().m124116d(4, new Object[0]);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ReactionMessageManager", e11);
                C23744a.Companion.m124119a().m124116d(4, new Object[0]);
            }
        } catch (Throwable th2) {
            C23744a.Companion.m124119a().m124116d(4, new Object[0]);
            throw th2;
        }
    }

    /* renamed from: M */
    private final String m126665M(String str) {
        CharSequence m127168X0;
        Pattern compile = Pattern.compile("\\W");
        Pattern compile2 = Pattern.compile("\\s");
        int length = str.length();
        String str2 = "";
        for (int i11 = 0; i11 < length; i11++) {
            Matcher matcher = compile.matcher(String.valueOf(str.charAt(i11)));
            if (matcher.find() && !compile2.matcher(matcher.group()).find()) {
                str2 = ((Object) str2) + "\\" + str.charAt(i11);
            } else {
                char charAt = str.charAt(i11);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) str2);
                sb2.append(charAt);
                str2 = sb2.toString();
            }
        }
        m127168X0 = AbstractC24342w.m127168X0(str2);
        String lowerCase = m127168X0.toString().toLowerCase(Locale.ROOT);
        AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
        String m120002o = AbstractC23262x6.m120002o(lowerCase);
        AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
        return m120002o;
    }

    /* renamed from: Q */
    private final void m126666Q(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C24753f) it.next()).m128611y());
        }
        AbstractC0924m0.m3964ki(jSONArray.toString());
    }

    /* renamed from: e */
    private final void m126670e(C24755h c24755h, C24755h c24755h2) {
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: oh.k

            /* renamed from: q */
            public final /* synthetic */ C24755h f117194q;

            /* renamed from: r */
            public final /* synthetic */ C24265l f117195r;

            public /* synthetic */ RunnableC24264k(C24755h c24755h22, C24265l this) {
                r2 = c24755h22;
                r3 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C24265l.m126671f(C24755h.this, r2, r3);
            }
        });
    }

    /* renamed from: f */
    public static final void m126671f(C24755h c24755h, C24755h c24755h2, C24265l c24265l) {
        AbstractC19074t.m100208f(c24755h, "$currentNode");
        AbstractC19074t.m100208f(c24755h2, "$targetNode");
        AbstractC19074t.m100208f(c24265l, "this$0");
        String m128623a = ((C24754g) c24755h.m128629e()).m128623a();
        String m128623a2 = ((C24754g) c24755h2.m128629e()).m128623a();
        int length = m128623a2.length();
        for (int length2 = m128623a.length(); length2 < length; length2++) {
            char charAt = m128623a2.charAt(length2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) m128623a);
            sb2.append(charAt);
            m128623a = sb2.toString();
            if (!AbstractC19074t.m100204b(String.valueOf(m128623a2.charAt(length2)), "\\")) {
                if (!AbstractC19074t.m100204b(m128623a, m128623a2)) {
                    C24755h m128627c = c24755h.m128627c(m128623a);
                    if (m128627c == null) {
                        c24755h = c24755h.m128625a(m128623a, new C24754g(m128623a, c24265l.m126674j(m128623a, ((C24754g) c24755h.m128629e()).m128624b())));
                    } else {
                        c24755h = m128627c;
                    }
                } else {
                    c24755h.m128626b(((C24754g) c24755h2.m128629e()).m128623a(), c24755h2);
                }
            }
        }
    }

    /* renamed from: g */
    private final void m126672g(C24753f c24753f) {
        int m116584g;
        synchronized (this.f117203g) {
            this.f117203g.add(c24753f);
            m116584g = AbstractC22543l.m116584g(this.f117203g.size(), 12);
            ArrayList arrayList = this.f117203g;
            ArrayList arrayList2 = new ArrayList(arrayList.subList(arrayList.size() - m116584g, this.f117203g.size()));
            this.f117203g.clear();
            this.f117203g.addAll(arrayList2);
        }
    }

    /* renamed from: i */
    private final List m126673i(String str) {
        List m131185M0;
        ArrayList arrayList = new ArrayList();
        if (str.length() == 0) {
            return arrayList;
        }
        String m126678z = m126678z(str);
        C24755h c24755h = (C24755h) this.f117209m.get(m126678z);
        if (c24755h == null) {
            m131185M0 = AbstractC25332a0.m131185M0(this.f117208l.keySet());
            List m126674j = m126674j(str, m131185M0);
            C24755h c24755h2 = new C24755h(new C24754g(m126678z, m126674j));
            Map map = this.f117209m;
            AbstractC19074t.m100207e(map, "mapTreeSearch");
            map.put(m126678z, c24755h2);
            m126670e(c24755h2, new C24755h(new C24754g(str, m126674j)));
            arrayList.addAll(m126677v(6, m126674j));
            return arrayList;
        }
        int i11 = 1;
        if (str.length() == 1) {
            arrayList.addAll(m126677v(6, ((C24754g) c24755h.m128629e()).m128624b()));
            return arrayList;
        }
        String m128623a = ((C24754g) c24755h.m128629e()).m128623a();
        C24755h m128628d = c24755h.m128628d();
        if (!AbstractC19074t.m100204b(m128623a, str)) {
            int length = str.length();
            while (true) {
                if (i11 >= length) {
                    break;
                }
                m128623a = m128623a + str.charAt(i11);
                if (!AbstractC19074t.m100204b(String.valueOf(str.charAt(i11)), "\\")) {
                    C24755h m128627c = c24755h.m128627c(m128623a);
                    if (m128627c == null) {
                        m128628d = c24755h;
                        c24755h = m128627c;
                        break;
                    }
                    m128628d = c24755h;
                    c24755h = m128627c;
                }
                i11++;
            }
        }
        if (AbstractC19074t.m100204b(m128623a, str)) {
            if (c24755h == null) {
                if (m128628d != null) {
                    List m126674j2 = m126674j(str, ((C24754g) m128628d.m128629e()).m128624b());
                    arrayList.addAll(m126677v(6, m126674j2));
                    m126670e(m128628d, new C24755h(new C24754g(str, m126674j2)));
                }
            } else {
                arrayList.addAll(m126677v(6, ((C24754g) c24755h.m128629e()).m128624b()));
            }
            return arrayList;
        }
        if (m128628d != null) {
            List m126674j3 = m126674j(str, ((C24754g) m128628d.m128629e()).m128624b());
            arrayList.addAll(m126677v(6, m126674j3));
            m126670e(m128628d, new C24755h(new C24754g(str, m126674j3)));
        }
        return arrayList;
    }

    /* renamed from: j */
    private final List m126674j(String str, List list) {
        List m131177E0;
        ArrayList arrayList = new ArrayList();
        try {
            String m120002o = AbstractC23262x6.m120002o(str);
            AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
            String m126708a = Companion.m126708a(m120002o);
            if (m126708a.length() > 0) {
                Pattern compile = Pattern.compile(m126708a, 2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    String m120002o2 = AbstractC23262x6.m120002o((String) obj);
                    AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
                    if (compile.matcher(m120002o2).find()) {
                        arrayList2.add(obj);
                    }
                }
                m131177E0 = AbstractC25332a0.m131177E0(arrayList2, new c());
                arrayList.addAll(m131177E0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: r */
    private final ArrayList m126675r() {
        m126663I();
        return this.f117203g;
    }

    /* renamed from: s */
    public static final C24265l m126676s() {
        return Companion.m126709b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:            if (((p588vw.C28652r.c) r5).f132857c.size() == r8) goto L71;     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List m126677v(int i11, List list) {
        Object m131216p0;
        Object m131216p02;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ArrayList<String> arrayList2 = (ArrayList) this.f117208l.get((String) it.next());
            if (arrayList2 != null) {
                for (String str : arrayList2) {
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, str);
                        if (!arrayList.isEmpty()) {
                            m131216p02 = AbstractC25332a0.m131216p0(arrayList);
                        }
                        arrayList.add(new C28652r.c(0));
                        if (!arrayList.isEmpty()) {
                            m131216p0 = AbstractC25332a0.m131216p0(arrayList);
                            C28652r.c cVar = (C28652r.c) m131216p0;
                            if (!TextUtils.isEmpty(str) && !AbstractC19074t.m100204b(str, ":-|") && !AbstractC19074t.m100204b(str, ":+") && !AbstractC19074t.m100204b(str, ";8") && !AbstractC19074t.m100204b(str, "/-jj")) {
                                cVar.f132857c.add(str);
                            }
                        }
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C28652r.c cVar2 = new C28652r.c(1);
            cVar2.f132856b = 4;
            arrayList.add(cVar2);
        }
        return arrayList;
    }

    /* renamed from: z */
    private final String m126678z(String str) {
        char m127205d1;
        char m127205d12;
        m127205d1 = AbstractC24344y.m127205d1(str);
        if (!AbstractC19074t.m100204b(String.valueOf(m127205d1), "\\")) {
            m127205d12 = AbstractC24344y.m127205d1(str);
            return "" + m127205d12;
        }
        if (str.length() <= 1) {
            return "";
        }
        String substring = str.substring(0, 2);
        AbstractC19074t.m100207e(substring, "substring(...)");
        return substring;
    }

    /* renamed from: A */
    public final boolean m126679A() {
        return !m126675r().isEmpty();
    }

    /* renamed from: B */
    public final boolean m126680B() {
        return this.f117200d || this.f117198b;
    }

    /* renamed from: C */
    public final boolean m126681C() {
        return AbstractC23309i.m120975Gg();
    }

    /* renamed from: D */
    public final boolean m126682D() {
        return this.f117214r;
    }

    /* renamed from: E */
    public final boolean m126683E() {
        if (m126681C() && (!Companion.m126709b().m126698n().isEmpty())) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public final void m126684G() {
        if (this.f117211o) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: oh.j
            public /* synthetic */ RunnableC24263j() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C24265l.m126662H(C24265l.this);
            }
        });
    }

    /* renamed from: J */
    public final void m126685J(String str) {
        try {
            try {
                if (!this.f117200d) {
                    this.f117199c.clear();
                    if (m126699o().m128544b()) {
                        ArrayList arrayList = new ArrayList();
                        if (str != null && str.length() > 0) {
                            try {
                                JSONArray jSONArray = new JSONArray(str);
                                int length = jSONArray.length();
                                for (int i11 = 0; i11 < length; i11++) {
                                    C24753f.b bVar = C24753f.Companion;
                                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                                    AbstractC19074t.m100207e(jSONObject, "getJSONObject(...)");
                                    arrayList.add(bVar.m128618e(jSONObject));
                                }
                            } catch (Exception e11) {
                                AbstractC23350e.m122778h(e11);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            this.f117199c.addAll(arrayList);
                        } else {
                            this.f117199c.addAll(m126704w());
                            AbstractC0924m0.m3428Se(AbstractC23309i.m121339Qa());
                        }
                    } else {
                        this.f117199c.addAll(m126704w());
                    }
                }
                this.f117200d = true;
                C23744a.Companion.m124119a().m124116d(4, new Object[0]);
            } catch (Exception e12) {
                AbstractC23350e.m122776f("ReactionMessageManager", e12);
                C23744a.Companion.m124119a().m124116d(4, new Object[0]);
            }
        } catch (Throwable th2) {
            C23744a.Companion.m124119a().m124116d(4, new Object[0]);
            throw th2;
        }
    }

    /* renamed from: K */
    public final void m126686K(String str) {
        AbstractC19074t.m100208f(str, "reactionInfo");
        try {
            if (str.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.f117213q = jSONObject.optString("reaction_thumb_v2");
            boolean z11 = true;
            if (jSONObject.optInt("enable_colorful_color") >= 1) {
                z11 = false;
            }
            this.f117214r = z11;
            if (jSONObject.has("reaction_type")) {
                C24753f.b bVar = C24753f.Companion;
                JSONObject jSONObject2 = jSONObject.getJSONObject("reaction_type");
                AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                this.f117212p = bVar.m128618e(jSONObject2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ReactionMessageManager", e11);
        }
    }

    /* renamed from: N */
    public final void m126687N() {
        this.f117200d = false;
        this.f117198b = false;
        m126698n();
    }

    /* renamed from: O */
    public final void m126688O() {
        this.f117216t = false;
        this.f117200d = false;
        this.f117202f = false;
        this.f117211o = false;
    }

    /* renamed from: P */
    public final void m126689P(List list) {
        AbstractC19074t.m100208f(list, "newData");
        ArrayList arrayList = this.f117199c;
        arrayList.clear();
        arrayList.addAll(list);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f117199c.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C24753f) it.next()).m128611y());
        }
        AbstractC0924m0.m3428Se(jSONArray.toString());
    }

    /* renamed from: R */
    public final void m126690R(int i11) {
        this.f117207k = i11;
    }

    /* renamed from: S */
    public final void m126691S(String str) {
        CharSequence m127168X0;
        AbstractC19074t.m100208f(str, "value");
        m127168X0 = AbstractC24342w.m127168X0(str);
        this.f117201e = m127168X0.toString();
    }

    /* renamed from: T */
    public final void m126692T() {
        Object obj;
        ArrayList m126675r = m126675r();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : m126675r) {
            C24753f c24753f = (C24753f) obj2;
            Iterator it = m126698n().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC19074t.m100204b(c24753f.m128597j(), ((C24753f) obj).m128597j())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (((C24753f) obj) == null) {
                arrayList.add(obj2);
            }
        }
        this.f117203g.clear();
        this.f117203g.addAll(arrayList);
        m126666Q(arrayList);
    }

    /* renamed from: d */
    public final void m126693d(String str) {
        Object obj;
        Object obj2;
        AbstractC19074t.m100208f(str, "icon");
        if (this.f117207k == 1) {
            synchronized (this.f117203g) {
                Iterator it = this.f117199c.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (AbstractC19074t.m100204b(((C24753f) obj2).m128595h(), str)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (obj2 != null) {
                    return;
                }
                Iterator it2 = this.f117203g.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (AbstractC19074t.m100204b(((C24753f) next).m128595h(), str)) {
                        obj = next;
                        break;
                    }
                }
                C24753f c24753f = (C24753f) obj;
                if (c24753f != null) {
                    this.f117203g.remove(c24753f);
                }
                m126672g(m126705x(str));
                m126666Q(this.f117203g);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: h */
    public final int m126694h() {
        String m126665M = m126665M(this.f117201e);
        System.currentTimeMillis();
        List m126673i = m126673i(m126665M);
        this.f117210n.clear();
        this.f117210n.addAll(m126673i);
        return this.f117210n.size();
    }

    /* renamed from: k */
    public final int m126695k(int i11, int i12) {
        int i13;
        HashMap hashMap = this.f117205i;
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Number) ((C24860q) entry.getValue()).m129215c()).intValue();
            int intValue2 = ((Number) ((C24860q) entry.getValue()).m129216d()).intValue();
            int intValue3 = ((Number) entry.getKey()).intValue();
            float f11 = 1.0f;
            if (intValue < i11 || intValue2 > i12) {
                if (i11 >= intValue && i12 <= intValue2) {
                    i13 = i12 - i11;
                } else {
                    int i14 = i11 + 1;
                    if (i14 <= intValue2 && intValue2 < i12) {
                        i13 = intValue2 - i11;
                    } else if (i14 <= intValue && intValue < i12) {
                        i13 = i12 - intValue;
                    } else {
                        f11 = 0.0f;
                    }
                }
                f11 = (i13 * 1.0f) / (intValue2 - intValue);
            }
            arrayList.add(new C24860q(Integer.valueOf(intValue3), Float.valueOf(f11)));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((C24860q) next).m129216d()).floatValue();
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((C24860q) next2).m129216d()).floatValue();
                    if (Float.compare(floatValue, floatValue2) < 0) {
                        next = next2;
                        floatValue = floatValue2;
                    }
                } while (it.hasNext());
            }
            return ((Number) ((C24860q) next).m129215c()).intValue();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public final int m126696l() {
        return this.f117207k;
    }

    /* renamed from: m */
    public final String m126697m() {
        return this.f117201e;
    }

    /* renamed from: n */
    public final List m126698n() {
        if (!this.f117200d) {
            m126685J(AbstractC0924m0.m3826g0());
        }
        return this.f117199c;
    }

    /* renamed from: o */
    public final C24748a m126699o() {
        m126661F();
        return this.f117215s;
    }

    /* renamed from: p */
    public final C24753f m126700p() {
        C24753f c24753f = this.f117212p;
        if (c24753f == null) {
            return new C24753f(C24753f.Companion.m128620g("/-heart"), "/-heart", 0, 0, 0L, 28, null);
        }
        return c24753f;
    }

    /* renamed from: q */
    public final List m126701q(int i11, boolean z11, boolean z12) {
        String str;
        int i12;
        boolean z13;
        String str2;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (this.f117201e.length() > 0) {
            arrayList.addAll(this.f117210n);
            return arrayList;
        }
        this.f117204h.clear();
        this.f117205i.clear();
        if (this.f117207k == 1) {
            List m126698n = m126698n();
            C28652r.c cVar = new C28652r.c(1);
            MainApplication.C6895a c6895a = MainApplication.Companion;
            cVar.f132858d = c6895a.m35500c().getString(AbstractC8020f0.str_default_section_emoji_custom_reaction_picker);
            cVar.f132860f = true;
            cVar.f132859e = c6895a.m35500c().getString(AbstractC8020f0.str_action_edit_default_reaction_list);
            arrayList.add(cVar);
            int size = ((m126698n.size() + i11) - 1) / i11;
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                C28652r.c cVar2 = new C28652r.c(0);
                cVar2.f132861g = true;
                int i15 = 0;
                while (i15 < i11 && i13 < m126698n.size()) {
                    cVar2.f132857c.add(((C24753f) m126698n.get(i13)).m128595h());
                    i15++;
                    i13++;
                }
                arrayList.add(cVar2);
            }
        }
        if (this.f117207k != 0) {
            if (z11) {
                ArrayList arrayList2 = new ArrayList(m126675r());
                if (!arrayList2.isEmpty()) {
                    C28652r.c cVar3 = new C28652r.c(1);
                    MainApplication.C6895a c6895a2 = MainApplication.Companion;
                    cVar3.f132858d = c6895a2.m35500c().getString(AbstractC8020f0.str_title_emoji_recent);
                    if (this.f117207k == 1) {
                        str2 = c6895a2.m35500c().getString(AbstractC8020f0.str_action_edit);
                    } else {
                        str2 = "";
                    }
                    cVar3.f132859e = str2;
                    arrayList.add(cVar3);
                    HashMap hashMap = this.f117204h;
                    String str3 = cVar3.f132858d;
                    AbstractC19074t.m100207e(str3, "title");
                    hashMap.put(-2, str3);
                    int size2 = ((arrayList2.size() + i11) - 1) / i11;
                    this.f117205i.put(-2, new C24860q(Integer.valueOf(arrayList.size() - 1), Integer.valueOf((arrayList.size() + size2) - 1)));
                    int size3 = arrayList2.size() - 1;
                    for (int i16 = 0; i16 < size2; i16++) {
                        C28652r.c cVar4 = new C28652r.c(0);
                        cVar4.f132861g = true;
                        int i17 = 0;
                        while (i17 < i11 && size3 >= 0) {
                            cVar4.f132857c.add(((C24753f) arrayList2.get(size3)).m128595h());
                            i17++;
                            size3--;
                        }
                        arrayList.add(cVar4);
                    }
                }
            }
            ArrayList m143379s = C28652r.m143349v().m143379s();
            AbstractC19074t.m100205c(m143379s);
            if (!(!m143379s.isEmpty())) {
                str = "title";
            } else {
                C28652r.c cVar5 = new C28652r.c(1);
                cVar5.f132856b = z11 ? 1 : 0;
                cVar5.f132858d = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_title_emoticon);
                arrayList.add(cVar5);
                HashMap hashMap2 = this.f117204h;
                String str4 = cVar5.f132858d;
                AbstractC19074t.m100207e(str4, "title");
                hashMap2.put(-1, str4);
                int size4 = ((m143379s.size() + i11) - 1) / i11;
                str = "title";
                this.f117205i.put(-1, new C24860q(Integer.valueOf(arrayList.size() - 1), Integer.valueOf((arrayList.size() + size4) - 1)));
                for (int i18 = 0; i18 < size4; i18++) {
                    C28652r.c cVar6 = new C28652r.c(0);
                    for (int i19 = 0; i19 < i11; i19++) {
                        int i21 = (i18 * i11) + i19;
                        if (i21 < m143379s.size()) {
                            Object obj = m143379s.get(i21);
                            AbstractC19074t.m100207e(obj, "get(...)");
                            String str5 = (String) obj;
                            if (!TextUtils.isEmpty(str5) && !AbstractC19074t.m100204b(str5, ":-|") && !AbstractC19074t.m100204b(str5, ":+") && !AbstractC19074t.m100204b(str5, ";8") && !AbstractC19074t.m100204b(str5, "/-jj")) {
                                cVar6.f132857c.add(m143379s.get(i21));
                            }
                        }
                    }
                    AbstractC19074t.m100207e(cVar6.f132857c, "emoticonList");
                    if (!r6.isEmpty()) {
                        arrayList.add(cVar6);
                    }
                }
            }
            if (m126699o().m128546d()) {
                if (C28652r.m143349v().m143359L()) {
                    int i22 = 1;
                    int m143385z = C28652r.m143349v().m143385z(true);
                    ArrayList arrayList3 = new ArrayList(C28652r.m143349v().m143384y(true));
                    int i23 = 0;
                    while (i23 < m143385z) {
                        C28652r.c cVar7 = new C28652r.c(i22);
                        cVar7.f132856b = 2;
                        cVar7.f132858d = ((C31949hb) arrayList3.get(i23)).m153606d().toString();
                        arrayList.add(cVar7);
                        HashMap hashMap3 = this.f117204h;
                        Integer valueOf = Integer.valueOf(i23);
                        String str6 = cVar7.f132858d;
                        String str7 = str;
                        AbstractC19074t.m100207e(str6, str7);
                        hashMap3.put(valueOf, str6);
                        C31949hb c31949hb = (C31949hb) arrayList3.get(i23);
                        if (c31949hb != null) {
                            int size5 = ((c31949hb.m153605c().size() + i11) - 1) / i11;
                            this.f117205i.put(Integer.valueOf(i23), new C24860q(Integer.valueOf(arrayList.size() - 1), Integer.valueOf((arrayList.size() + size5) - 1)));
                            for (int i24 = 0; i24 < size5; i24++) {
                                C28652r.c cVar8 = new C28652r.c(0);
                                for (int i25 = 0; i25 < i11; i25++) {
                                    int i26 = (i24 * i11) + i25;
                                    if (i26 < c31949hb.m153605c().size()) {
                                        cVar8.f132857c.add(c31949hb.m153605c().get(i26));
                                    }
                                }
                                arrayList.add(cVar8);
                            }
                        }
                        i23++;
                        str = str7;
                        i22 = 1;
                    }
                } else {
                    String str8 = str;
                    String[] strArr = C28652r.f132831w;
                    AbstractC19074t.m100205c(strArr);
                    if (strArr.length == 0) {
                        i12 = 1;
                        z13 = true;
                    } else {
                        i12 = 1;
                        z13 = false;
                    }
                    if (!z13) {
                        C28652r.c cVar9 = new C28652r.c(i12);
                        cVar9.f132856b = z11 ? 1 : 0;
                        cVar9.f132858d = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_title_emoji_system);
                        arrayList.add(cVar9);
                        HashMap hashMap4 = this.f117204h;
                        String str9 = cVar9.f132858d;
                        AbstractC19074t.m100207e(str9, str8);
                        hashMap4.put(-1, str9);
                        int length = ((strArr.length + i11) - 1) / i11;
                        this.f117205i.put(-1, new C24860q(Integer.valueOf(arrayList.size() - 1), Integer.valueOf((arrayList.size() + length) - 1)));
                        for (int i27 = 0; i27 < length; i27++) {
                            C28652r.c cVar10 = new C28652r.c(0);
                            for (int i28 = 0; i28 < i11; i28++) {
                                int i29 = (i27 * i11) + i28;
                                if (i29 < strArr.length) {
                                    String str10 = strArr[i29];
                                    AbstractC19074t.m100207e(str10, "get(...)");
                                    if (!TextUtils.isEmpty(str10) && !AbstractC19074t.m100204b(str10, ":-|") && !AbstractC19074t.m100204b(str10, ":+") && !AbstractC19074t.m100204b(str10, ";8") && !AbstractC19074t.m100204b(str10, "/-jj")) {
                                        cVar10.f132857c.add(strArr[i29]);
                                    }
                                }
                            }
                            AbstractC19074t.m100207e(cVar10.f132857c, "emoticonList");
                            if (!r7.isEmpty()) {
                                arrayList.add(cVar10);
                            }
                        }
                    }
                }
            }
        }
        if (z12) {
            C28652r.c cVar11 = new C28652r.c(1);
            cVar11.f132856b = 4;
            arrayList.add(cVar11);
        }
        this.f117206j = arrayList.size();
        return arrayList;
    }

    /* renamed from: t */
    public final int m126702t(int i11) {
        C24860q c24860q = (C24860q) this.f117205i.get(Integer.valueOf(i11));
        if (c24860q != null) {
            return ((Number) c24860q.m129215c()).intValue();
        }
        return -1;
    }

    /* renamed from: u */
    public final List m126703u(boolean z11) {
        ArrayList arrayList = new ArrayList();
        if (z11 && (!m126675r().isEmpty())) {
            arrayList.add(new C12955e(-2));
        }
        arrayList.add(new C12955e(-1));
        int m143385z = C28652r.m143349v().m143385z(true);
        for (int i11 = 0; i11 < m143385z; i11++) {
            arrayList.add(new C12955e(i11));
        }
        return arrayList;
    }

    /* renamed from: w */
    public final List m126704w() {
        if (!this.f117198b) {
            m126664L(AbstractC23309i.m121339Qa());
        }
        return this.f117197a;
    }

    /* renamed from: x */
    public final C24753f m126705x(String str) {
        Object obj;
        AbstractC19074t.m100208f(str, "icon");
        Iterator it = m126698n().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC19074t.m100204b(((C24753f) obj).m128595h(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C24753f c24753f = (C24753f) obj;
        if (c24753f == null) {
            return C24753f.Companion.m128615b(100, str);
        }
        return c24753f;
    }

    /* renamed from: y */
    public final String m126706y() {
        return this.f117213q;
    }

    private C24265l() {
        this.f117197a = new ArrayList();
        this.f117199c = new ArrayList();
        this.f117201e = "";
        this.f117203g = new ArrayList();
        this.f117204h = new HashMap();
        this.f117205i = new HashMap();
        this.f117208l = Collections.synchronizedMap(new HashMap());
        this.f117209m = Collections.synchronizedMap(new HashMap());
        this.f117210n = new ArrayList();
        this.f117215s = new C24748a(false, false, false, false, false, 0, 63, null);
    }
}
