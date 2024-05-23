package p310l0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C1074g;
import androidx.appcompat.widget.AbstractC1225y0;
import androidx.appcompat.widget.C1211t1;
import androidx.core.view.AbstractC1530b;
import androidx.core.view.AbstractC1619y;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p175g0.AbstractC19187j;
import p225i1.InterfaceMenuC20183a;
import p336m0.MenuItemC22699c;

/* renamed from: l0.g */
/* loaded from: classes2.dex */
public class C21986g extends MenuInflater {

    /* renamed from: e */
    static final Class[] f108259e;

    /* renamed from: f */
    static final Class[] f108260f;

    /* renamed from: a */
    final Object[] f108261a;

    /* renamed from: b */
    final Object[] f108262b;

    /* renamed from: c */
    Context f108263c;

    /* renamed from: d */
    private Object f108264d;

    /* renamed from: l0.g$a */
    /* loaded from: classes2.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class[] f108265c = {MenuItem.class};

        /* renamed from: a */
        private Object f108266a;

        /* renamed from: b */
        private Method f108267b;

        public a(Object obj, String str) {
            this.f108266a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f108267b = cls.getMethod(str, f108265c);
            } catch (Exception e11) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e11);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f108267b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f108267b.invoke(this.f108266a, menuItem)).booleanValue();
                }
                this.f108267b.invoke(this.f108266a, menuItem);
                return true;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* renamed from: l0.g$b */
    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: A */
        AbstractC1530b f108268A;

        /* renamed from: B */
        private CharSequence f108269B;

        /* renamed from: C */
        private CharSequence f108270C;

        /* renamed from: D */
        private ColorStateList f108271D = null;

        /* renamed from: E */
        private PorterDuff.Mode f108272E = null;

        /* renamed from: a */
        private Menu f108274a;

        /* renamed from: b */
        private int f108275b;

        /* renamed from: c */
        private int f108276c;

        /* renamed from: d */
        private int f108277d;

        /* renamed from: e */
        private int f108278e;

        /* renamed from: f */
        private boolean f108279f;

        /* renamed from: g */
        private boolean f108280g;

        /* renamed from: h */
        private boolean f108281h;

        /* renamed from: i */
        private int f108282i;

        /* renamed from: j */
        private int f108283j;

        /* renamed from: k */
        private CharSequence f108284k;

        /* renamed from: l */
        private CharSequence f108285l;

        /* renamed from: m */
        private int f108286m;

        /* renamed from: n */
        private char f108287n;

        /* renamed from: o */
        private int f108288o;

        /* renamed from: p */
        private char f108289p;

        /* renamed from: q */
        private int f108290q;

        /* renamed from: r */
        private int f108291r;

        /* renamed from: s */
        private boolean f108292s;

        /* renamed from: t */
        private boolean f108293t;

        /* renamed from: u */
        private boolean f108294u;

        /* renamed from: v */
        private int f108295v;

        /* renamed from: w */
        private int f108296w;

        /* renamed from: x */
        private String f108297x;

        /* renamed from: y */
        private String f108298y;

        /* renamed from: z */
        private String f108299z;

        public b(Menu menu) {
            this.f108274a = menu;
            m114816h();
        }

        /* renamed from: c */
        private char m114808c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private Object m114809e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C21986g.this.f108263c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot instantiate class: ");
                sb2.append(str);
                return null;
            }
        }

        /* renamed from: i */
        private void m114810i(MenuItem menuItem) {
            boolean z11;
            MenuItem enabled = menuItem.setChecked(this.f108292s).setVisible(this.f108293t).setEnabled(this.f108294u);
            boolean z12 = false;
            if (this.f108291r >= 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            enabled.setCheckable(z11).setTitleCondensed(this.f108285l).setIcon(this.f108286m);
            int i11 = this.f108295v;
            if (i11 >= 0) {
                menuItem.setShowAsAction(i11);
            }
            if (this.f108299z != null) {
                if (!C21986g.this.f108263c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(C21986g.this.m114807b(), this.f108299z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f108291r >= 2) {
                if (menuItem instanceof C1074g) {
                    ((C1074g) menuItem).m5122t(true);
                } else if (menuItem instanceof MenuItemC22699c) {
                    ((MenuItemC22699c) menuItem).m117396h(true);
                }
            }
            String str = this.f108297x;
            if (str != null) {
                menuItem.setActionView((View) m114809e(str, C21986g.f108259e, C21986g.this.f108261a));
                z12 = true;
            }
            int i12 = this.f108296w;
            if (i12 > 0 && !z12) {
                menuItem.setActionView(i12);
            }
            AbstractC1530b abstractC1530b = this.f108268A;
            if (abstractC1530b != null) {
                AbstractC1619y.m8252a(menuItem, abstractC1530b);
            }
            AbstractC1619y.m8254c(menuItem, this.f108269B);
            AbstractC1619y.m8258g(menuItem, this.f108270C);
            AbstractC1619y.m8253b(menuItem, this.f108287n, this.f108288o);
            AbstractC1619y.m8257f(menuItem, this.f108289p, this.f108290q);
            PorterDuff.Mode mode = this.f108272E;
            if (mode != null) {
                AbstractC1619y.m8256e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f108271D;
            if (colorStateList != null) {
                AbstractC1619y.m8255d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m114811a() {
            this.f108281h = true;
            m114810i(this.f108274a.add(this.f108275b, this.f108282i, this.f108283j, this.f108284k));
        }

        /* renamed from: b */
        public SubMenu m114812b() {
            this.f108281h = true;
            SubMenu addSubMenu = this.f108274a.addSubMenu(this.f108275b, this.f108282i, this.f108283j, this.f108284k);
            m114810i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m114813d() {
            return this.f108281h;
        }

        /* renamed from: f */
        public void m114814f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C21986g.this.f108263c.obtainStyledAttributes(attributeSet, AbstractC19187j.MenuGroup);
            this.f108275b = obtainStyledAttributes.getResourceId(AbstractC19187j.MenuGroup_android_id, 0);
            this.f108276c = obtainStyledAttributes.getInt(AbstractC19187j.MenuGroup_android_menuCategory, 0);
            this.f108277d = obtainStyledAttributes.getInt(AbstractC19187j.MenuGroup_android_orderInCategory, 0);
            this.f108278e = obtainStyledAttributes.getInt(AbstractC19187j.MenuGroup_android_checkableBehavior, 0);
            this.f108279f = obtainStyledAttributes.getBoolean(AbstractC19187j.MenuGroup_android_visible, true);
            this.f108280g = obtainStyledAttributes.getBoolean(AbstractC19187j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m114815g(AttributeSet attributeSet) {
            C1211t1 m5715u = C1211t1.m5715u(C21986g.this.f108263c, attributeSet, AbstractC19187j.MenuItem);
            this.f108282i = m5715u.m5730n(AbstractC19187j.MenuItem_android_id, 0);
            this.f108283j = (m5715u.m5727k(AbstractC19187j.MenuItem_android_menuCategory, this.f108276c) & (-65536)) | (m5715u.m5727k(AbstractC19187j.MenuItem_android_orderInCategory, this.f108277d) & 65535);
            this.f108284k = m5715u.m5732p(AbstractC19187j.MenuItem_android_title);
            this.f108285l = m5715u.m5732p(AbstractC19187j.MenuItem_android_titleCondensed);
            this.f108286m = m5715u.m5730n(AbstractC19187j.MenuItem_android_icon, 0);
            this.f108287n = m114808c(m5715u.m5731o(AbstractC19187j.MenuItem_android_alphabeticShortcut));
            this.f108288o = m5715u.m5727k(AbstractC19187j.MenuItem_alphabeticModifiers, 4096);
            this.f108289p = m114808c(m5715u.m5731o(AbstractC19187j.MenuItem_android_numericShortcut));
            this.f108290q = m5715u.m5727k(AbstractC19187j.MenuItem_numericModifiers, 4096);
            if (m5715u.m5735s(AbstractC19187j.MenuItem_android_checkable)) {
                this.f108291r = m5715u.m5717a(AbstractC19187j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f108291r = this.f108278e;
            }
            this.f108292s = m5715u.m5717a(AbstractC19187j.MenuItem_android_checked, false);
            this.f108293t = m5715u.m5717a(AbstractC19187j.MenuItem_android_visible, this.f108279f);
            this.f108294u = m5715u.m5717a(AbstractC19187j.MenuItem_android_enabled, this.f108280g);
            this.f108295v = m5715u.m5727k(AbstractC19187j.MenuItem_showAsAction, -1);
            this.f108299z = m5715u.m5731o(AbstractC19187j.MenuItem_android_onClick);
            this.f108296w = m5715u.m5730n(AbstractC19187j.MenuItem_actionLayout, 0);
            this.f108297x = m5715u.m5731o(AbstractC19187j.MenuItem_actionViewClass);
            String m5731o = m5715u.m5731o(AbstractC19187j.MenuItem_actionProviderClass);
            this.f108298y = m5731o;
            if (m5731o != null && this.f108296w == 0 && this.f108297x == null) {
                this.f108268A = (AbstractC1530b) m114809e(m5731o, C21986g.f108260f, C21986g.this.f108262b);
            } else {
                this.f108268A = null;
            }
            this.f108269B = m5715u.m5732p(AbstractC19187j.MenuItem_contentDescription);
            this.f108270C = m5715u.m5732p(AbstractC19187j.MenuItem_tooltipText);
            if (m5715u.m5735s(AbstractC19187j.MenuItem_iconTintMode)) {
                this.f108272E = AbstractC1225y0.m5773e(m5715u.m5727k(AbstractC19187j.MenuItem_iconTintMode, -1), this.f108272E);
            } else {
                this.f108272E = null;
            }
            if (m5715u.m5735s(AbstractC19187j.MenuItem_iconTint)) {
                this.f108271D = m5715u.m5719c(AbstractC19187j.MenuItem_iconTint);
            } else {
                this.f108271D = null;
            }
            m5715u.m5736w();
            this.f108281h = false;
        }

        /* renamed from: h */
        public void m114816h() {
            this.f108275b = 0;
            this.f108276c = 0;
            this.f108277d = 0;
            this.f108278e = 0;
            this.f108279f = true;
            this.f108280g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f108259e = clsArr;
        f108260f = clsArr;
    }

    public C21986g(Context context) {
        super(context);
        this.f108263c = context;
        Object[] objArr = {context};
        this.f108261a = objArr;
        this.f108262b = objArr;
    }

    /* renamed from: a */
    private Object m114805a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return m114805a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:            if (r15 == 2) goto L116;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:            if (r15 == 3) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:            r15 = r13.getName();     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:            if (r7 == false) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:            if (r15.equals(r8) == false) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:            r8 = null;        r7 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:            r15 = r13.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:            if (r15.equals("group") == false) goto L103;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:            r0.m114816h();     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:            if (r15.equals("item") == false) goto L113;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:            if (r0.m114813d() != false) goto L140;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:            r15 = r0.f108268A;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:            if (r15 == null) goto L112;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:            if (r15.mo7698a() == false) goto L112;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:            r0.m114812b();     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:            r0.m114811a();     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:            if (r15.equals("menu") == false) goto L143;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:            r6 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:            if (r7 == false) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:            r15 = r13.getName();     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:            if (r15.equals("group") == false) goto L121;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:            r0.m114814f(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:            if (r15.equals("item") == false) goto L124;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:            r0.m114815g(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:            if (r15.equals("menu") == false) goto L127;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:            m114806c(r13, r14, r0.m114812b());     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:            r8 = r15;        r7 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:            throw new java.lang.RuntimeException("Unexpected end of document");     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:            r8 = null;        r6 = false;        r7 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:            if (r6 != false) goto L135;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:            if (r15 == 1) goto L136;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m114806c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    /* renamed from: b */
    Object m114807b() {
        if (this.f108264d == null) {
            this.f108264d = m114805a(this.f108263c);
        }
        return this.f108264d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i11, Menu menu) {
        if (!(menu instanceof InterfaceMenuC20183a)) {
            super.inflate(i11, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f108263c.getResources().getLayout(i11);
                    m114806c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e11) {
                    throw new InflateException("Error inflating menu XML", e11);
                }
            } catch (IOException e12) {
                throw new InflateException("Error inflating menu XML", e12);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
