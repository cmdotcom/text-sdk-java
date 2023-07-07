
## @cmdotcom/text-sdk: A helper library to send messages.

Want to send messages in your Java application? Then you are at the right place.
If you want to get all the functionalities, go to: [CM.com API Docs](https://developers.cm.com/messaging)


## Installing
Warning: Namespace has been changed between 1.3 and 2.0
### Above 2.0
You can find our SDK [here](https://mvnrepository.com/artifact/com.cm/text-sdk), or below incase you are using a generic pom.xml.
```xml
<dependency>
    <groupId>com.cm</groupId>
    <artifactId>text-sdk</artifactId>
    <version>2.1.0</version>
</dependency>
```

### Version 1.3
Version 1.3 is available as JAR under the [1.3 release here](https://github.com/cmdotcom/text-sdk-java/releases/tag/v1.3-snapshot) <br>
You will have to add GSON manually: https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.5


## Instantiate the client
Use your productToken which authorizes you on the CM platform. Get yours on CM.com

```cs
MessagingClient client = new MessagingClient("YourCMProductToken");
```

## Send a message
By calling `SendTextMessage` and providing message text, sender name, recipient phone number(s).

```cs
   MessagingClient client = new MessagingClient("YourProductToken");
      client.sendTextMessage("Message Text", "TestSender", new String[] {"00316012345678"});
   
```
## Sending a message with auto detect encoding
By using the `MessageBuilder` it is possible to send messages with auto detect encoding, 

It is possible to let our gateway detect the encoding for you by including the type: auto setting. 
In case it detects characters that are not part of the GSM character set, the message will be delivered as Unicode.

see our API docs for more info https://developers.cm.com/messaging/

```cs
 MessagingClient client = new MessagingClient("YourProductToken");
 MessageBuilder builder = new MessageBuilder("Message Text", "auto",  "TestSender", new String[] {"00316012345678"});
      
      Message message = builder.Build();

      client.sendMessage(message);
```

## Sending a rich message
By using the `MessageBuilder` it is possible to create images with media for channels such as WhatsApp and Viber
```cs
 MessagingClient client = new MessagingClient("YourProductToken");

 MessageBuilder builder = new MessageBuilder("Message Text", "TestSender", new String[] {"00316012345678"});

 builder.WithAllowedChannels(new Channel[] {Channel.Viber});

    builder.WithRichMessage(new MediaMessage(
                "cm.com",
                "https://avatars3.githubusercontent.com/u/8234794?s=200&v=4",
                "image/png"));


       Message message = builder.Build();

       client.sendMessage(message);
```

## Get the result
Sending an message returns the response body
```cs
{
	"details": "Created 1 message(s)",
	"errorCode": 0,
	"messages": [{
		"to": "00316012345678",
		"status": "Accepted",
		"reference": null,
		"parts": 1,
		"messageDetails": null,
		"messageErrorCode": 0
	}]
}
```

## Whatsapp Templates
Send WhatsApp template messages using the message builder please take a look at our documentation in the [Whatsapp templates section](https://developers.cm.com/messaging/docs/whatsapp#template)
```cs
		 
MessagingClient client = new MessagingClient("YourProductToken");
 
 MessageBuilder builder = new MessageBuilder("Template Test", "CM.COM", new String[] {"0031636170815"});

 builder.WithAllowedChannels(new Channel[] {Channel.WhatsApp});       
           
		TemplateMessage template = new TemplateMessage();
          
        template.Content = new TemplateMessageContent();
          
        template.Content.WhatsAppTemplate = new WhatsAppTemplate();
        template.Content.WhatsAppTemplate.Name = "template-name";
        template.Content.WhatsAppTemplate.Namespace = "the-namespace-of-template";
        template.Content.WhatsAppTemplate.Language =  new TemplateLanguage("CountryCode", "deterministic");
        template.Content.WhatsAppTemplate.LocalizableParams = new LocalizableParam[] {};
        template.Content.WhatsAppTemplate.Components = new TemplateComponents[] {new TemplateComponents("header", 
        new TemplateParameters[] { new TemplateParameters("image",  new MediaContent("cm.com"", 
								"https://avatars3.githubusercontent.com/u/8234794?s=200&v=4", 
								"image/png"))}),
        new TemplateComponents("body", 
                          new TemplateParameters[] { new TemplateParameters("text",  "TestMessage"), 
                          new TemplateParameters("text",  "Dutch GP")})};  
         
                                   
		builder.WithTemplate(template);

		Message message = builder.Build();
          
		client.sendMessage(message); 
```


