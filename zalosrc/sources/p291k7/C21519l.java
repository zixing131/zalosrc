package p291k7;

import android.content.res.AssetManager;
import java.io.File;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p231i7.C20359c;

/* renamed from: k7.l */
/* loaded from: classes.dex */
public final class C21519l {

    /* renamed from: a */
    private final C20359c f104558a;

    /* renamed from: b */
    private XmlPullParser f104559b;

    public C21519l(C20359c c20359c) {
        this.f104558a = c20359c;
    }

    /* renamed from: a */
    public final long m111172a() {
        if (this.f104559b == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        while (true) {
            int next = this.f104559b.next();
            if (next != 2) {
                if (next == 1) {
                    break;
                }
            } else if (this.f104559b.getName().equals("manifest")) {
                String attributeValue = this.f104559b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.f104559b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue != null) {
                    try {
                        int parseInt = Integer.parseInt(attributeValue);
                        if (attributeValue2 == null) {
                            return parseInt;
                        }
                        try {
                            return (Integer.parseInt(attributeValue2) << 32) | (parseInt & 4294967295L);
                        } catch (NumberFormatException e11) {
                            throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", e11.getMessage()));
                        }
                    } catch (NumberFormatException e12) {
                        throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", e12.getMessage()));
                    }
                }
                throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
            }
        }
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    /* renamed from: b */
    public final void m111173b(AssetManager assetManager, File file) {
        this.f104559b = assetManager.openXmlResourceParser(C20359c.m106120b(assetManager, file), "AndroidManifest.xml");
    }
}
