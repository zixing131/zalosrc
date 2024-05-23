package me0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import cu.AbstractC17574a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import p239ih.C20556f;
import p277ju.C21365c;

/* renamed from: me0.o4 */
/* loaded from: classes4.dex */
public final class C23164o4 {

    /* renamed from: a */
    private byte[] f112342a;

    /* renamed from: b */
    private byte[] f112343b;

    /* renamed from: c */
    private byte[] f112344c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: me0.o4$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        public static C23164o4 f112345a = new C23164o4();
    }

    /* renamed from: a */
    private static int m119322a(int i11, int i12, int i13, int i14) {
        int i15 = 1;
        if (i12 > i14 || i11 > i13) {
            int i16 = i12 / 2;
            int i17 = i11 / 2;
            while (i16 / i15 >= i14 && i17 / i15 >= i13) {
                i15 *= 2;
            }
        }
        return i15;
    }

    /* renamed from: c */
    private static Bitmap m119323c(String str, Bitmap bitmap, int i11, int i12) {
        int m120058b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i11 / width, i12 / height);
        if (!TextUtils.isEmpty(str) && (m120058b = AbstractC23277z1.m120058b(str)) != 0) {
            matrix.postRotate(m120058b);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: d */
    private Bitmap m119324d(byte[] bArr) {
        byte[] m119327i = m119327i(bArr[0]);
        int m93600g = AbstractC17574a.m93600g(m119327i, new byte[]{-1, -64}) + 5;
        byte[] copyOfRange = Arrays.copyOfRange(m119327i, 0, m93600g);
        byte[] copyOfRange2 = Arrays.copyOfRange(m119327i, m93600g, m119327i.length);
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr, 1, 5);
        byte[] m93596c = AbstractC17574a.m93596c(AbstractC17574a.m93596c(AbstractC17574a.m93596c(AbstractC17574a.m93596c(new byte[0], copyOfRange), copyOfRange3), copyOfRange2), Arrays.copyOfRange(bArr, 5, bArr.length));
        return BitmapFactory.decodeByteArray(m93596c, 0, m93596c.length);
    }

    /* renamed from: e */
    private byte[] m119325e(Bitmap bitmap, double d11) {
        byte[] m119329b = m119329b(bitmap, d11);
        int m93600g = AbstractC17574a.m93600g(m119329b, new byte[]{-1, -64});
        int m93600g2 = AbstractC17574a.m93600g(m119329b, new byte[]{-1, -38});
        return AbstractC17574a.m93596c(AbstractC17574a.m93596c(new byte[]{3}, Arrays.copyOfRange(m119329b, m93600g + 5, m93600g + 9)), Arrays.copyOfRange(m119329b, m93600g2, m119329b.length));
    }

    /* renamed from: h */
    public static Bitmap m119326h(String str, int i11, int i12, boolean z11) {
        Bitmap decodeFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            ParcelFileDescriptor m106841n = new C20556f(str).m106841n();
            if (m106841n == null) {
                if (m106841n != null) {
                    try {
                        m106841n.close();
                    } catch (IOException unused) {
                    }
                }
                return null;
            }
            try {
                if (z11) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFileDescriptor(m106841n.getFileDescriptor(), null, options);
                    int m119322a = m119322a(options.outWidth, options.outHeight, i11, i12);
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = m119322a;
                    decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(m106841n.getFileDescriptor(), null, options2);
                } else {
                    decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(m106841n.getFileDescriptor());
                }
                try {
                    m106841n.close();
                } catch (IOException unused2) {
                }
                if (i12 > 0 && i11 > 0) {
                    float width = (decodeFileDescriptor.getWidth() * 1.0f) / decodeFileDescriptor.getHeight();
                    float f11 = i11;
                    float f12 = i12;
                    if ((1.0f * f11) / f12 > width) {
                        i11 = Math.round(f12 * width);
                    } else {
                        i12 = Math.round(f11 / width);
                    }
                    return m119323c(str, decodeFileDescriptor, i11, i12);
                }
                return decodeFileDescriptor;
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptor = m106841n;
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: i */
    private byte[] m119327i(byte b11) {
        if (b11 != 0) {
            if (b11 != 1) {
                if (b11 != 2) {
                    if (b11 != 3) {
                        return new byte[0];
                    }
                    if (this.f112344c == null) {
                        this.f112344c = AbstractC23244v8.m119741e("/9j/4AAQSkZJRgABAAAAAQABAAD/2wCEABYPERMRDhYTEhMZFxYaITckIR4eIUQwMyg3UEZUU09GTUxYY39sWF54X0xNbpZweIOHjpCOVmqcp5uKpn+LjokBFxkZIR0hQSQkQYlbTVuJiYmJiYmJiYmJiYmJiYmJiYmJiYmJiYmJiYmJiYmJiYmJiYmJiYmJiYmJiYmJiYmJif/AABEIAwERAAIRAQMRAf/EAaIAAAEFAQEBAQEBAAAAAAAAAAABAgMEBQYHCAkKCxAAAgEDAwIEAwUFBAQAAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6AQADAQEBAQEBAQEBAAAAAAAAAQIDBAUGBwgJCgsRAAIBAgQEAwQHBQQEAAECdwABAgMRBAUhMQYSQVEHYXETIjKBCBRCkaGxwQkjM1LwFWJy0QoWJDThJfEXGBkaJicoKSo1Njc4OTpDREVGR0hJSlNUVVZXWFlaY2RlZmdoaWpzdHV2d3h5eoKDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uLj5OXm5+jp6vLz9PX29/j5+g==");
                    }
                    return this.f112344c;
                }
                if (this.f112343b == null) {
                    this.f112343b = AbstractC23244v8.m119741e("/9j/4AAQSkZJRgABAQAASABIAAD/4QBYRXhpZgAATU0AKgAAAAgAAgESAAMAAAABAAEAAIdpAAQAAAABAAAAJgAAAAAAA6ABAAMAAAABAAEAAKACAAQAAAABAAAAHqADAAQAAAABAAAAFAAAAAD/7QA4UGhvdG9zaG9wIDMuMAA4QklNBAQAAAAAAAA4QklNBCUAAAAAABDUHYzZjwCyBOmACZjs+EJ+/8AAEQgDASIAAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQAAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEAAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSExBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElKU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9sAQwAJCQkJCQkQCQkQFhAQEBYeFhYWFh4mHh4eHh4mLiYmJiYmJi4uLi4uLi4uNzc3Nzc3QEBAQEBISEhISEhISEhI/9sAQwELDAwSERIfEREfSzMqM0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tL/90ABAAC");
                }
                return this.f112343b;
            }
            if (this.f112342a == null) {
                this.f112342a = AbstractC23244v8.m119741e("/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAoHBwkHBgoJCAkLCwoMDxkQDw4ODx4WFxIZJCAmJSMgIyIoLTkwKCo2KyIjMkQyNjs9QEBAJjBGS0U+Sjk/QD3/2wBDAQsLCw8NDx0QEB09KSMpPT09PT09PT09PT09PT09PT09PT09PT09PT09PT09PT09PT09PT09PT09PT09PT09PT3/wAARCAMBEQACEQEDEQH/xAAfAAABBQEBAQEBAQAAAAAAAAAAAQIDBAUGBwgJCgv/xAC1EAACAQMDAgQDBQUEBAAAAX0BAgMABBEFEiExQQYTUWEHInEUMoGRoQgjQrHBFVLR8CQzYnKCCQoWFxgZGiUmJygpKjQ1Njc4OTpDREVGR0hJSlNUVVZXWFlaY2RlZmdoaWpzdHV2d3h5eoOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4eLj5OXm5+jp6vHy8/T19vf4+fr/xAAfAQADAQEBAQEBAQEBAAAAAAAAAQIDBAUGBwgJCgv/xAC1EQACAQIEBAMEBwUEBAABAncAAQIDEQQFITEGEkFRB2FxEyIygQgUQpGhscEJIzNS8BVictEKFiQ04SXxFxgZGiYnKCkqNTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqCg4SFhoeIiYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrCw8TFxsfIycrS09TV1tfY2dri4+Tl5ufo6ery8/T19vf4+fo=");
            }
            return this.f112342a;
        }
        return AbstractC23244v8.m119741e("/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDACgcHiMeGSgjISMtKygwPGRBPDc3PHtYXUlkkYCZlo+AjIqgtObDoKrarYqMyP/L2u71////m8H////6/+b9//j/2wBDASstLTw1PHZBQXb4pYyl+Pj4+Pj4+Pj4+Pj4+Pj4+Pj4+Pj4+Pj4+Pj4+Pj4+Pj4+Pj4+Pj4+Pj4+Pj4+Pj4+Pj/wAARCAMBIgACEQEDEQH/xAAfAAABBQEBAQEBAQAAAAAAAAAAAQIDBAUGBwgJCgv/xAC1EAACAQMDAgQDBQUEBAAAAX0BAgMABBEFEiExQQYTUWEHInEUMoGRoQgjQrHBFVLR8CQzYnKCCQoWFxgZGiUmJygpKjQ1Njc4OTpDREVGR0hJSlNUVVZXWFlaY2RlZmdoaWpzdHV2d3h5eoOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4eLj5OXm5+jp6vHy8/T19vf4+fr/xAAfAQADAQEBAQEBAQEBAAAAAAAAAQIDBAUGBwgJCgv/xAC1EQACAQIEBAMEBwUEBAABAncAAQIDEQQFITEGEkFRB2FxEyIygQgUQpGhscEJIzNS8BVictEKFiQ04SXxFxgZGiYnKCkqNTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqCg4SFhoeIiYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrCw8TFxsfIycrS09TV1tfY2dri4+Tl5ufo6ery8/T19vf4+fo=");
    }

    /* renamed from: j */
    public static C23164o4 m119328j() {
        return a.f112345a;
    }

    /* renamed from: b */
    public byte[] m119329b(Bitmap bitmap, double d11) {
        if (d11 <= 0.0d) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C21365c c21365c = new C21365c(d11);
        c21365c.mo108929b(byteArrayOutputStream);
        c21365c.mo108933a(bitmap);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        return byteArray;
    }

    /* renamed from: f */
    public Bitmap m119330f(byte[] bArr) {
        return m119324d(bArr);
    }

    /* renamed from: g */
    public byte[] m119331g(String str, int i11, int i12) {
        try {
            Bitmap m119326h = m119326h(str, i11, i12, true);
            if (m119326h == null) {
                return null;
            }
            byte[] m119325e = m119325e(m119326h, 36.0d);
            m119326h.recycle();
            return m119325e;
        } catch (Exception unused) {
            return null;
        }
    }

    private C23164o4() {
        this.f112342a = null;
        this.f112343b = null;
        this.f112344c = null;
    }
}
