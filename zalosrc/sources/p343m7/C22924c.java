package p343m7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p291k7.C21536q1;
import p317l7.AbstractC22104a;

/* renamed from: m7.c */
/* loaded from: classes3.dex */
public final class C22924c {

    /* renamed from: c */
    private static final C21536q1 f111590c = new C21536q1("LocalTestingConfigParser");

    /* renamed from: a */
    private final XmlPullParser f111591a;

    /* renamed from: b */
    private final AbstractC22942u f111592b = AbstractC22943v.m117660c();

    C22924c(XmlPullParser xmlPullParser) {
        this.f111591a = xmlPullParser;
    }

    /* renamed from: a */
    public static AbstractC22943v m117651a(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return AbstractC22943v.f111636a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(fileReader);
                final C22924c c22924c = new C22924c(newPullParser);
                c22924c.m117654e("local-testing-config", new InterfaceC22947z() { // from class: m7.y
                    @Override // p343m7.InterfaceC22947z
                    public final void zza() {
                        C22924c.this.m117655d();
                    }
                });
                AbstractC22943v m117659e = c22924c.f111592b.m117659e();
                fileReader.close();
                return m117659e;
            } catch (Throwable th2) {
                try {
                    fileReader.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e11) {
            f111590c.m111198e("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e11.getMessage());
            return AbstractC22943v.f111636a;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m117652b(final C22924c c22924c) {
        for (int i11 = 0; i11 < c22924c.f111591a.getAttributeCount(); i11++) {
            if ("defaultErrorCode".equals(c22924c.f111591a.getAttributeName(i11))) {
                c22924c.f111592b.mo117647a(AbstractC22104a.m115323a(c22924c.f111591a.getAttributeValue(i11)));
            }
        }
        c22924c.m117654e("split-install-error", new InterfaceC22947z() { // from class: m7.w
            @Override // p343m7.InterfaceC22947z
            public final void zza() {
                C22924c.m117653c(C22924c.this);
            }
        });
    }

    /* renamed from: c */
    public static /* synthetic */ void m117653c(C22924c c22924c) {
        String str = null;
        String str2 = null;
        for (int i11 = 0; i11 < c22924c.f111591a.getAttributeCount(); i11++) {
            if ("module".equals(c22924c.f111591a.getAttributeName(i11))) {
                str = c22924c.f111591a.getAttributeValue(i11);
            }
            if ("errorCode".equals(c22924c.f111591a.getAttributeName(i11))) {
                str2 = c22924c.f111591a.getAttributeValue(i11);
            }
        }
        if (str != null && str2 != null) {
            c22924c.f111592b.mo117650d().put(str, Integer.valueOf(AbstractC22104a.m115323a(str2)));
            do {
            } while (c22924c.f111591a.next() != 3);
            return;
        }
        throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), c22924c.f111591a, null);
    }

    /* renamed from: e */
    private final void m117654e(String str, InterfaceC22947z interfaceC22947z) {
        while (true) {
            int next = this.f111591a.next();
            if (next != 3 && next != 1) {
                if (this.f111591a.getEventType() == 2) {
                    if (this.f111591a.getName().equals(str)) {
                        interfaceC22947z.zza();
                    } else {
                        throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, this.f111591a.getName()), this.f111591a, null);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m117655d() {
        m117654e("split-install-errors", new InterfaceC22947z() { // from class: m7.x
            @Override // p343m7.InterfaceC22947z
            public final void zza() {
                C22924c.m117652b(C22924c.this);
            }
        });
    }
}
