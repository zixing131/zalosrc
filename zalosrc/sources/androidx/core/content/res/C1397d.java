package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.res.d */
/* loaded from: classes2.dex */
public final class C1397d {

    /* renamed from: a */
    private final Shader f6128a;

    /* renamed from: b */
    private final ColorStateList f6129b;

    /* renamed from: c */
    private int f6130c;

    private C1397d(Shader shader, ColorStateList colorStateList, int i11) {
        this.f6128a = shader;
        this.f6129b = colorStateList;
        this.f6130c = i11;
    }

    /* renamed from: a */
    private static C1397d m7038a(Resources resources, int i11, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i11);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    return m7040c(AbstractC1396c.m7031b(resources, xml, asAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return m7041d(AbstractC1399f.m7071b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static C1397d m7039b(int i11) {
        return new C1397d(null, null, i11);
    }

    /* renamed from: c */
    static C1397d m7040c(ColorStateList colorStateList) {
        return new C1397d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C1397d m7041d(Shader shader) {
        return new C1397d(shader, null, 0);
    }

    /* renamed from: g */
    public static C1397d m7042g(Resources resources, int i11, Resources.Theme theme) {
        try {
            return m7038a(resources, i11, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public int m7043e() {
        return this.f6130c;
    }

    /* renamed from: f */
    public Shader m7044f() {
        return this.f6128a;
    }

    /* renamed from: h */
    public boolean m7045h() {
        return this.f6128a != null;
    }

    /* renamed from: i */
    public boolean m7046i() {
        ColorStateList colorStateList;
        if (this.f6128a == null && (colorStateList = this.f6129b) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m7047j(int[] iArr) {
        if (m7046i()) {
            ColorStateList colorStateList = this.f6129b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f6130c) {
                this.f6130c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m7048k(int i11) {
        this.f6130c = i11;
    }

    /* renamed from: l */
    public boolean m7049l() {
        if (!m7045h() && this.f6130c == 0) {
            return false;
        }
        return true;
    }
}
