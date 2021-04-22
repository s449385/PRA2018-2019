<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output encoding="iso-8859-1" version="1.0"/>

    <xsl:template match="CollectionOfPoems">
        <html>
            <body>
                <h1>Zbiór wierszy</h1>
                <xsl:apply-templates/>               
            </body>
        </html>
    </xsl:template>
    <xsl:template match="Poem">
        <br/>
        <xsl:apply-templates select="Author"/>
        
        <h2>
            <xsl:apply-templates select="Title"/>
        </h2>
        <h3>
            <xsl:apply-templates select="Subtitle"/>
        </h3>        
        <xsl:apply-templates select="Strophe"/>

    </xsl:template>

    <xsl:template match="Author">
        <h3>
            <xsl:apply-templates select="FirstName"/>
            <xsl:text>&#160;</xsl:text>
            <xsl:apply-templates select="LastName"/>
        </h3>
    </xsl:template>

    <xsl:template match="Strophe">
        <p>
            <xsl:apply-templates/>
        </p>
    </xsl:template>

    <xsl:template match="Verse">
        <xsl:apply-templates/>
        <br/>
    </xsl:template> 

    <xsl:template match="Bold">
        <b>
            <xsl:apply-templates/>
        </b>
    </xsl:template>


    
    
</xsl:stylesheet> 