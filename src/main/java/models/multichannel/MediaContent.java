package models.multichannel;

public class MediaContent {
    /// <summary>
    ///     The name of the image, audio or video.
    /// </summary>
    public String MediaName;

    /// <summary>
    ///     The location of the image, audio or video.
    /// </summary>
    public String MediaUri;

    /// <summary>
    ///     The mimetype of the image, audio or video.
    /// </summary>
    public String MimeType;

    /// <summary>
    ///     Default constructor
    /// </summary>
    public MediaContent()
    {
    }

    /// <summary>
    ///     Constructor which sets values
    /// </summary>
    /// <param name="mediaName"></param>
    /// <param name="mediaUri"></param>
    /// <param name="mimeType"></param>
    public MediaContent(String mediaName, String mediaUri, String mimeType)
    {
        this.MediaName = mediaName;
        this.MediaUri = mediaUri;
        this.MimeType = mimeType;
    }

}
