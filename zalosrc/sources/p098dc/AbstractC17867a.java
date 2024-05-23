package p098dc;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: dc.a */
/* loaded from: classes3.dex */
public abstract class AbstractC17867a {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0090, code lost:            return r1;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Animation m94393a(Context context, XmlPullParser xmlPullParser, AnimationSet animationSet, AttributeSet attributeSet, File file) {
        AbstractC17874h c17879m;
        int depth = xmlPullParser.getDepth();
        Animation animation = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("set")) {
                        c17879m = new C17875i(attributeSet, file);
                        m94393a(context, xmlPullParser, (AnimationSet) c17879m.mo94403b(), attributeSet, file);
                    } else if (name.equals("alpha")) {
                        c17879m = new C17873g(attributeSet, file);
                    } else if (name.equals("scale")) {
                        c17879m = new C17878l(attributeSet, file);
                    } else if (name.equals("rotate")) {
                        c17879m = new C17877k(attributeSet, file);
                    } else if (name.equals("translate")) {
                        c17879m = new C17879m(attributeSet, file);
                    } else {
                        throw new RuntimeException("Unknown animation name: " + xmlPullParser.getName());
                    }
                    animation = c17879m.mo94403b();
                    if (animationSet != null) {
                        animationSet.addAnimation(animation);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0153, code lost:            return r2;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Interpolator m94394b(XmlPullParser xmlPullParser) {
        Interpolator accelerateInterpolator;
        boolean z11;
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            boolean z12 = true;
            if (next == 1) {
                break;
            }
            if (next == 2) {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                String name = xmlPullParser.getName();
                if (name.equals("linearInterpolator")) {
                    interpolator = new LinearInterpolator();
                } else {
                    if (name.equals("accelerateInterpolator")) {
                        accelerateInterpolator = new AccelerateInterpolator(asAttributeSet.getAttributeFloatValue(null, "android:factor", 1.0f));
                    } else if (name.equals("decelerateInterpolator")) {
                        accelerateInterpolator = new DecelerateInterpolator(asAttributeSet.getAttributeFloatValue(null, "android:factor", 1.0f));
                    } else if (name.equals("accelerateDecelerateInterpolator")) {
                        interpolator = new AccelerateDecelerateInterpolator();
                    } else if (name.equals("cycleInterpolator")) {
                        accelerateInterpolator = new CycleInterpolator(asAttributeSet.getAttributeFloatValue(null, "android:cycles", 1.0f));
                    } else if (name.equals("anticipateInterpolator")) {
                        accelerateInterpolator = new AnticipateInterpolator(asAttributeSet.getAttributeFloatValue(null, "android:tension", 2.0f));
                    } else if (name.equals("overshootInterpolator")) {
                        accelerateInterpolator = new OvershootInterpolator(asAttributeSet.getAttributeFloatValue(null, "android:tension", 2.0f));
                    } else if (name.equals("anticipateOvershootInterpolator")) {
                        interpolator = new AnticipateOvershootInterpolator(asAttributeSet.getAttributeFloatValue(null, "android:tension", 2.0f), asAttributeSet.getAttributeFloatValue(null, "android:extraTension", 1.5f));
                    } else if (name.equals("bounceInterpolator")) {
                        interpolator = new BounceInterpolator();
                    } else if (name.equals("pathInterpolator")) {
                        if (asAttributeSet.getAttributeValue(null, "android:controlX1") != null) {
                            if (asAttributeSet.getAttributeValue(null, "android:controlY1") != null) {
                                float attributeFloatValue = asAttributeSet.getAttributeFloatValue(null, "android:controlX1", 0.0f);
                                float attributeFloatValue2 = asAttributeSet.getAttributeFloatValue(null, "android:controlY1", 0.0f);
                                if (asAttributeSet.getAttributeValue(null, "android:controlX2") != null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (asAttributeSet.getAttributeValue(null, "android:controlY2") == null) {
                                    z12 = false;
                                }
                                if (z11 == z12) {
                                    if (!z11) {
                                        interpolator = new PathInterpolator(attributeFloatValue, attributeFloatValue2);
                                    } else {
                                        interpolator = new PathInterpolator(attributeFloatValue, attributeFloatValue2, asAttributeSet.getAttributeFloatValue(null, "android:controlX2", 0.0f), asAttributeSet.getAttributeFloatValue(null, "android:controlY2", 0.0f));
                                    }
                                } else {
                                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                                }
                            } else {
                                throw new InflateException("pathInterpolator requires the controlY1 attribute");
                            }
                        } else {
                            throw new InflateException("pathInterpolator requires the controlX1 attribute");
                        }
                    } else {
                        throw new RuntimeException("Unknown interpolator name: " + xmlPullParser.getName());
                    }
                    interpolator = accelerateInterpolator;
                }
            }
        }
    }

    /* renamed from: c */
    public static Animation m94395c(Context context, File file) {
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    newPullParser.setInput(bufferedInputStream2, "utf-8");
                    Animation m94393a = m94393a(context, newPullParser, null, Xml.asAttributeSet(newPullParser), file.getParentFile());
                    try {
                        bufferedInputStream2.close();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    return m94393a;
                } catch (IOException e12) {
                    e = e12;
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation " + file);
                    notFoundException.initCause(e);
                    throw notFoundException;
                } catch (XmlPullParserException e13) {
                    e = e13;
                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation " + file);
                    notFoundException2.initCause(e);
                    throw notFoundException2;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception e14) {
                            e14.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e15) {
                e = e15;
            } catch (XmlPullParserException e16) {
                e = e16;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x002a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:43), block:B:22:0x002a */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Interpolator m94396d(File file) {
        XmlPullParserException e11;
        IOException e12;
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;
        InputStream inputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (IOException e13) {
                e12 = e13;
            } catch (XmlPullParserException e14) {
                e11 = e14;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
            }
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                newPullParser.setInput(bufferedInputStream, "utf-8");
                Interpolator m94394b = m94394b(newPullParser);
                try {
                    bufferedInputStream.close();
                } catch (Exception e15) {
                    e15.printStackTrace();
                }
                return m94394b;
            } catch (IOException e16) {
                e12 = e16;
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + file);
                notFoundException.initCause(e12);
                throw notFoundException;
            } catch (XmlPullParserException e17) {
                e11 = e17;
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + file);
                notFoundException2.initCause(e11);
                throw notFoundException2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Exception e18) {
                    e18.printStackTrace();
                }
            }
            throw th;
        }
    }
}
