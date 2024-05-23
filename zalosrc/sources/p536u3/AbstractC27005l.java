package p536u3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.JsonReader;
import com.androidquery.util.AbstractC3972e;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p502s3.C26117c;
import p566v3.C27502j;
import p566v3.C27508p;
import p620wt.AbstractC29237l;

/* renamed from: u3.l */
/* loaded from: classes2.dex */
public abstract class AbstractC27005l {
    /* renamed from: a */
    public static C27508p m139132a(InputStream inputStream, String str) {
        return m139135d(new JsonReader(new InputStreamReader(inputStream)), str);
    }

    /* renamed from: b */
    private static Map m139133b(JsonReader jsonReader) {
        jsonReader.beginObject();
        HashMap hashMap = new HashMap();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            byte[] decode = Base64.decode(jsonReader.nextString(), 0);
            hashMap.put(nextName, BitmapFactory.decodeByteArray(decode, 0, decode.length));
        }
        jsonReader.endObject();
        return hashMap;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: c */
    static C27508p m139134c(JsonReader jsonReader) {
        jsonReader.beginObject();
        C27508p.a aVar = new C27508p.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1872643448:
                    if (nextName.equals("canvas_size")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -290659267:
                    if (nextName.equals("features")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -270583694:
                    if (nextName.equals("frame_rate")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -102419164:
                    if (nextName.equals("bitmaps")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 106079:
                    if (nextName.equals("key")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 511278831:
                    if (nextName.equals("animation_groups")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 1301359490:
                    if (nextName.equals("animation_frame_count")) {
                        c11 = 6;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    aVar.f129415e = AbstractC26995b.m139111d(jsonReader);
                    break;
                case 1:
                    aVar.f129413c = AbstractC27000g.f127646a.m139106a(jsonReader);
                    break;
                case 2:
                    aVar.f129411a = jsonReader.nextInt();
                    break;
                case 3:
                    aVar.f129417g = m139133b(jsonReader);
                    break;
                case 4:
                    aVar.f129416f = jsonReader.nextInt();
                    break;
                case 5:
                    aVar.f129414d = AbstractC26998e.f127644a.m139106a(jsonReader);
                    break;
                case 6:
                    aVar.f129412b = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.m140655a();
    }

    /* renamed from: d */
    static C27508p m139135d(JsonReader jsonReader, String str) {
        C27508p m139134c = m139134c(jsonReader);
        if (m139134c.m140648c() == null) {
            m139134c.m140654i(new HashMap());
        }
        List m140650e = m139134c.m140650e();
        Map m140648c = m139134c.m140648c();
        int size = m140650e.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!m140648c.containsKey(((C27502j) m140650e.get(i11)).m140616b())) {
                String m140616b = ((C27502j) m140650e.get(i11)).m140616b();
                File file = new File(str + "/" + m140616b + ".png");
                if (!file.exists()) {
                    file = new File(str + "/" + m140616b);
                    if (!file.exists()) {
                        file = new File(str + "/assets/" + m140616b + ".png");
                        if (!file.exists()) {
                            file = new File(str + "/assets/" + m140616b);
                            if (!file.exists()) {
                            }
                        }
                    }
                }
                FileInputStream fileInputStream = null;
                try {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            FileDescriptor fd2 = fileInputStream2.getFD();
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            if (AbstractC3972e.m18765V()) {
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFileDescriptor(fd2, null, options);
                                options.inJustDecodeBounds = false;
                                options.inMutable = true;
                                Bitmap m134457b = C26117c.m134454d().m134457b(options.outWidth, options.outHeight, options.inPreferredConfig);
                                if (m134457b != null && !m134457b.isRecycled()) {
                                    options.inBitmap = m134457b;
                                }
                            }
                            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fd2, null, options);
                            if (decodeFileDescriptor != null) {
                                m140648c.put(m140616b, decodeFileDescriptor);
                            }
                            AbstractC29237l.m145996a(fileInputStream2);
                        } catch (IOException e11) {
                            e = e11;
                            fileInputStream = fileInputStream2;
                            AbstractC3972e.m18779e0(e);
                            AbstractC29237l.m145996a(fileInputStream);
                        } catch (RuntimeException e12) {
                            e = e12;
                            fileInputStream = fileInputStream2;
                            AbstractC3972e.m18779e0(e);
                            AbstractC29237l.m145996a(fileInputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            AbstractC29237l.m145996a(fileInputStream);
                            throw th;
                        }
                    } catch (IOException e13) {
                        e = e13;
                    } catch (RuntimeException e14) {
                        e = e14;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        return m139134c;
    }
}
